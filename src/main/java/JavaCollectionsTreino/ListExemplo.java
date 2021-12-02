package JavaCollectionsTreino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        String nome = nomes.get(2);

        System.out.println(nome);

        nomes.remove("Larissa");

        int tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temCarlos = nomes.contains("Carlos");

        System.out.println(temCarlos);

        boolean listatavazia = nomes.isEmpty();

        System.out.println(listatavazia);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        for (String nomeDoItem: nomes) {
            System.out.println("--> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("------> " + iterator.next());
        }

        nomes.clear();

        listatavazia = nomes.isEmpty();

        System.out.println(listatavazia);











}
}