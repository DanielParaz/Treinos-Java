package JavaSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTreino {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //adiciona os numeros no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens no set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println(numero);
        }
        //Diz se o set esta vazio
        System.out.println(sequenciaNumerica.isEmpty());

        sequenciaNumerica.clear();

        System.out.println(sequenciaNumerica.isEmpty());



    }
}
