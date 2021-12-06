package Desafios;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int distancia = leitor.nextInt();
        double litros = leitor.nextDouble();

        double media = distancia / litros  ;  //insira as variaveis de acordo com o enunciado
        System.out.printf("%.3f km/l%n", media);
    }

}

