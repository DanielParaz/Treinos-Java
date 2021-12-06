package Desafios;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Desafioproprioparadgma {
    public static void main(String[] args) {
        UnaryOperator<Float> calcularmedia = notas -> notas/4;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira suas notas abaixo: ");
        float n1 = leitor.nextFloat();
        float n2 = leitor.nextFloat();
        float n3 = leitor.nextFloat();
        float n4 = leitor.nextFloat();
        float notas = n1+n2+n3+n4;
        System.out.println("Sua média no ano foi: " + calcularmedia.apply(notas));

    }
}
