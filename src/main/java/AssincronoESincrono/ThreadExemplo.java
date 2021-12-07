package AssincronoESincrono;

public class ThreadExemplo {

    public static void main(String[] args) {
        BarradeCarregamento2 barradeCarregamento2 = new BarradeCarregamento2();
        BarradeCarregamento3 barradeCarregamento3 = new BarradeCarregamento3();

        barradeCarregamento2.start();
        barradeCarregamento3.start();

        barradeCarregamento2.run();
        barradeCarregamento3.run();


    }


}

class GerarPDF implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarradeCarregamento implements Runnable{
    @Override
    public void run() {
        System.out.println("loading ... ");
    }
}

class BarradeCarregamento2 extends Thread{
    @Override
    public void run() {
        super.run();

        try {
            Thread.sleep(5000);
            System.out.println("rodei  " + this.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarradeCarregamento3 extends Thread{
    @Override
    public void run() {
        super.run();


        try {
            Thread.sleep(1000);
            System.out.println("rodei  " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}