package JavaSet;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> inteiros = new TreeSet<>();
        inteiros.add(3);
        inteiros.add(88);
        inteiros.add(20);
        inteiros.add(44);
        inteiros.add(30);

        System.out.println(inteiros);

        Iterator<Integer> exibir = inteiros.iterator();

        while(exibir.hasNext()) {
            System.out.println(exibir.next());
        }

        System.out.println(inteiros.pollFirst());

        System.out.println(inteiros);

        inteiros.add(23);

        System.out.println(inteiros);

        System.out.println(inteiros.size());

        System.out.println(inteiros.isEmpty());



    }
}
