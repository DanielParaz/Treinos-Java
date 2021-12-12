package clienteHttpExemplo;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class clienteHttpExemplo {

    static ExecutorService executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread criada :: " + (thread.isDaemon() + "daemon" + "") + " Thread Group :: " +  thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAkamaiHTTP11();

    }
    private static void connectAkamaiHTTP11() {
        System.out.println("Running HTTP/2.2 example ...");
        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault()).build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code ::: " + response.statusCode());
            System.out.println("Response Headers ::: " + response.headers());
            String responsebody = response.body();
            System.out.println(responsebody);


            List<Future<?>> future = new ArrayList<>();

            responsebody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgrequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();


                            try {
                                HttpResponse<String> imageresponse = httpClient.send(imgrequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem Carregada :: " + image + "status code :: " + imageresponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de erro requisição para recuperação da imagem " + image);
                            }

                        });
                        future.add(imgFuture);
                        System.out.println("Imagens futuras submitidas no futuro para imagem" + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (ExecutionException | InterruptedException e) {
                    System.out.println("Fala ao esperar carregar a imagem do futuro ");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("TRempo de Carregamento total :: " + (end - start) + "milis");


        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }

    }

    private static void azonadePrintarURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("status code :: "+response.statusCode());
        System.out.println("Headers response :: "+response.headers());
        System.out.println(response.body());


    }
}