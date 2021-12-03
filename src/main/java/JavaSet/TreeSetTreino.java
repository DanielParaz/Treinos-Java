package JavaSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTreino {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta uma árvore com capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopólis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital ABAIXO na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianopólis"));

        //Retorna a primeira capital ACIMA na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianopólis"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Retorna a primeira capital no TOPO da árvore e remove ela do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a última capital no topo da árvore e remove ela do set
        System.out.println(treeCapitais.pollLast());

        //Exibe as capitais presente no set
        System.out.println(treeCapitais);

        //Navega pelas capitais no set pelo iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        //Navega pelas capitais no set pelo for
        for (String listacapitais: treeCapitais) {
            System.out.println(listacapitais);
        }
        //Diz se a árvore está vazia
        System.out.println(treeCapitais.isEmpty());

        treeCapitais.clear();

        System.out.println(treeCapitais.isEmpty());



    }
}
