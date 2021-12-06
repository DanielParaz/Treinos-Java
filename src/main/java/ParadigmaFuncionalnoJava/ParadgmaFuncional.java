package ParadigmaFuncionalnoJava;

import java.util.function.UnaryOperator;

public class ParadgmaFuncional {
    public static void main(String[] args) {
        UnaryOperator<Integer> CalcularValorVezes30 = valor -> valor*3; //um conceito do paradigma funcional ou programação funcional
        int valor = 10;
        System.out.println("O resultado é :" + CalcularValorVezes30.apply(valor));
    }
}
