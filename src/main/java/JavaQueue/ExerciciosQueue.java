package JavaQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosQueue {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nomezinhos: nomes) {
            System.out.println("--->" + nomezinhos);
        }

        String primeirofila = nomes.peek();

        System.out.println(primeirofila);

        String removeprimeirofila = nomes.poll();

        System.out.println(removeprimeirofila);

        System.out.println(nomes);

        nomes.add("Daniel");

        int quantidadefila = nomes.size();

        System.out.println("Daniel entrou na posição " + quantidadefila + "º");

        System.out.println(nomes);

        boolean tavazando = nomes.isEmpty();

        System.out.println(tavazando);

        boolean carlostanafila = nomes.contains("Carlos");

        System.out.println(carlostanafila);




















    }
}
