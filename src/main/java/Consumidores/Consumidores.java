package Consumidores;

import java.util.function.Consumer;
       //Metod References

// -apenas
// - utilizar o parametro da forma que ele foi recebido

public class Consumidores {
    public static void main(String[] args) {

        Consumer<String> imprimirumafrase = System.out::println;
//        Consumer<String> imprimirumafrase2 = frase -> System.out.println(frase);
        imprimirumafrase.accept("hello world");
//        imprimirumafrase2.accept("Hello World");
    }

}
