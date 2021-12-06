package ParadigmaFuncionalnoJava;

import java.util.Arrays;

public class Composicaodefuncoes {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};
        Arrays.stream(valores) //paradigma funcional
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(System.out::println);

        //paradigma imperativo

        for (int i = 0; i < valores.length; i++) {
            int valor = 0;
            if (valores[i] % 2 == 0) {
                valor = valores[i] * 2;

                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }
    }

}

