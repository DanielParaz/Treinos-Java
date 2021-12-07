package ExemploAPIJAVA8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<?>> futuros =
        new CopyOnWriteArrayList<>(casa.obterAfazeresDeCasa().stream()
                .map(atividade -> threadPool.submit(() -> atividade.realizar())).collect(Collectors.toList()));

        while (futuros.stream().allMatch(Future::isDone)){
            int numerodeAtividadesNaoFinalizadas = 0;
           for(Future<?> futuro : futuros) {
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabéns a você por completar" + futuro.get());
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
            }
            System.out.println("Numero de atividades não finalizadas: " + numerodeAtividadesNaoFinalizadas);

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
    void realizar();
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
    private void arrumarGuardaRoupa() {
        System.out.println("arrumar o guarda roupa");
    }
    private void varrerOQuarto() {
        System.out.println("Varrer o Quarto");
    }
    private void getArrumaraCama() {
        System.out.println("Arrumar a Cama");
    }
}