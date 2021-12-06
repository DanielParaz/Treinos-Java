package ParadigmaFuncionalnoJava;

import java.util.function.UnaryOperator;

public class FuncaoImutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornaroDobro = v -> v*2;
        System.out.println(retornaroDobro.apply(valor)); //retorna o dobro do valor
        System.out.println(valor); //valor não sera alterado
    }

}
