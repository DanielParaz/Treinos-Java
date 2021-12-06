package Desafios;
import java.util.Scanner;
public class DesafiosDigitalInnovationOne {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float valor1;
        float valor2;
        float valor3;
        float valor4;
        float valor5;
        float valor6;
        int pos;
        pos = 0;


        valor1 = ler.nextFloat();
        valor2 = ler.nextFloat();
        valor3 = ler.nextFloat();
        valor4 = ler.nextFloat();
        valor5 = ler.nextFloat();
        valor6 = ler.nextFloat();

        if (valor1 >= 0) {
            pos++;
            if (valor2 >= 0) {
                pos++;
            }
            if (valor3 >= 0) {
                pos++;
            }
            if (valor4 >= 0) {
                pos++;
            }
            if (valor5 >= 0) {
                pos++;
            }
            if (valor6 >= 0) {
                pos++;
            }
            System.out.println(pos + " valores positivos");


        }
    }
}


