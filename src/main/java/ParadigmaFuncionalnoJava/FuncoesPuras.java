package ParadigmaFuncionalnoJava;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira dois valores para serem comparados: ");
        int entrada = leitor.nextInt();
        int entrada2 = leitor.nextInt();
        System.out.println("A entrada1 é maior que a entrada 2?:  " + verificarSeEMaior.test(entrada,entrada2));
        System.out.println("A entrada2 é maior que a entrada1?:  " + verificarSeEMaior.test(entrada2,entrada));

    }
}
