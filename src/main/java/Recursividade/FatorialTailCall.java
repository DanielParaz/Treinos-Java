package Recursividade;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }
    public static double fatorialA (double valor) {
        return fatorialComTailCall(valor, 1);
    }
    public static double fatorialComTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor -1,numero*valor);
    }
//    5 * 4
//    20 * 3
//    60 * 2
//    120 * 1
//    120
}
