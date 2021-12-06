package Funcions.utillist;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> retornaNomeEmInteiroECalculaDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("Daniel"));
        System.out.println(retornaNomeEmInteiroECalculaDobro.apply("20"));


    }
}
