package Assincrono2;

public class SegundoExemplo {

    public static void main(String[] args) {
//        Thread Thread = new Thread(new BarradeCarregamento22());
//        Thread Thread2 = new Thread(new BarradeCarregamento33());
//
//
//        Thread.start();
//        Thread2.start();
//        System.out.println("Nome da Thread : "+Thread.getName());
//        System.out.println("Nome da Thread : "+Thread2.getName());
//

        GerarPDFF IniciarGerarPdf = new GerarPDFF();
        BarradeCarregamento1 IniciarBarradeCarregamento = new BarradeCarregamento1(IniciarGerarPdf);

        IniciarGerarPdf.start();
        IniciarBarradeCarregamento.start();

    }


}

class GerarPDFF extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarradeCarregamento1 extends Thread {
    private Thread iniciarGerarPdf;

    public BarradeCarregamento1(Thread iniciarGerarPdf) {

        this.iniciarGerarPdf = iniciarGerarPdf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!iniciarGerarPdf.isAlive()) {
                    break;
                }
                System.out.println("loading ... ");
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }
}

