package JavaSet;

import java.util.LinkedHashSet;

public class ExerciciosLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(30);
        numeros.add(30);

        System.out.println(numeros);

        for(Integer cu: numeros) {
            System.out.println(">>>>" + cu);
        }

        numeros.remove(3);

        System.out.println(numeros);

        numeros.add(23);

        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());


    }
}
