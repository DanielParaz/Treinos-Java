package ExemploAPIJAVA8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>> futuros =
        new CopyOnWriteArrayList<>(casa.obterAfazeresDeCasa().stream()
                .map(atividade -> threadPool.submit(() -> {
                    try {
                        return atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                }

                ))
                .collect(Collectors.toList()));

        while (true){
            int numerodeAtividadesNaoFinalizadas = 0;
           for(Future<?> futuro : futuros) {
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabéns a você por completar " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numerodeAtividadesNaoFinalizadas++;
                }
            }if (futuros.stream().allMatch(Future::isDone)) {
              break;
            }
            System.out.println("Numero de atividades não finalizadas: " + numerodeAtividadesNaoFinalizadas);
           Thread.sleep(500);


        }
        threadPool.shutdown();

    }

}
class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeresDeCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresDeComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                 pivo.addAll(atividades);
                 return pivo;
                });
    }
}

interface Atividade {
    String realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDeComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDeComodo() {
        return Arrays.asList(
            this::getArrumaraCama,
            this::varrerOQuarto,
            this::arrumarGuardaRoupa
        );
    }
    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String arrumar_Guarda_Roupa = "arrumar o guarda roupa";
        System.out.println("arrumar o guarda roupa");
        return arrumar_Guarda_Roupa;
    }
    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(7000);
        String varrer_o_quarto = "varrer o quarto";
        System.out.println("Varrer o Quarto");
        return varrer_o_quarto;
    }
    private String getArrumaraCama() throws InterruptedException {
        Thread.sleep(10000);
        String arrumar_a_cama = "Arrumar a cama";
        System.out.println("Arrumar a Cama");
        return arrumar_a_cama;
    }
}