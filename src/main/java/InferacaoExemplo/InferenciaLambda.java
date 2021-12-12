package InferacaoExemplo;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer,Double> divisaopor2 = (var numero) -> (double) (numero / 2);

        System.out.println(divisaopor2.apply(5));
    }
}
