package JavaSet;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;

public class ExercicioHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(30);

        System.out.println(numeros);

        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        numeros.remove(3);

        System.out.println(numeros);

        numeros.add(23);

        System.out.println(numeros);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());

    }
}
