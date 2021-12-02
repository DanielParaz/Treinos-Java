package PimentoesExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExemplo {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Fernando");
        nomes.add("Henrique");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("Joao");

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Fernando");

        System.out.println(nomes);




    }
}
