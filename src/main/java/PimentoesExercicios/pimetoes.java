package PimentoesExercicios;

import java.io.IOException;
import java.util.Scanner;


public class pimetoes {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        System.out.println("Insira o valor de pimentões amarelos: ");
        a = leitor.nextInt();
        System.out.println("Insira o valor de pimentões vermelhos: ");
        b = leitor.nextInt();
        int x = a+b;
        System.out.println("O valor de X = " + x);



    }
}