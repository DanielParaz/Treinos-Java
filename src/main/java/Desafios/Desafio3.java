package Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int valores;
        int pos = 0;
        int par = 0;
        int impar = 0;
        int neg = 0;

//continue a solução
        for (int i = 1; i <= 5; i++){
            valores = leitor.nextInt();
            if(valores % 2 == 0) {
                par++;}
            if(valores % 2 == 1) {
                impar++;
            }
            if(valores % 2 == -1){
                impar++;
            }
            if(valores >= 1) {
                pos++;
            }
            if(valores <= -1) {
                neg++;
            }
        }


        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(pos + " positivo(s)");
        System.out.println(neg + " negativo(s)");
    }

}