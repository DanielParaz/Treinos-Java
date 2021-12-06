package Predicados;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estadovazio = valor -> valor.isEmpty();
//        Predicate<String> estadovazio = String::isEmpty;
        System.out.println(estadovazio.test(""));
        System.out.println(estadovazio.test("Daniel"));
    }
}
