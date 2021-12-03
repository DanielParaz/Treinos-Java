package maps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTree {
    public static void main(String[] args) {
        TreeMap<String, String> capitais = new TreeMap<>();

        //Monta a árvore de capitais
        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianopolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(capitais.firstKey());

        //Retorna a primeira capital no final da arvore
        System.out.println(capitais.lastKey());

        //Retorna a primera capital abaixo da árvore da capital parametrizada
        System.out.println(capitais.lowerKey("SC"));

        //Retorna a primeira capital acima da árvore da capital parametrizada
        System.out.println(capitais.higherKey("SC"));

        //Exibe todas as capitais no console
        System.out.println(capitais);

        //Retonra a primeira capital no topo da árvore
        System.out.println(capitais.firstEntry().getKey() + "-----" + capitais.lastEntry().getValue());

        //Retorna a última capital no fim da árvore
        System.out.println(capitais.lastEntry().getKey() + "-----" + capitais.lastEntry().getValue());

        //Retorna a primera capital abaixo da capital parametrizada
        System.out.println(capitais.lowerEntry("SC").getKey() + "-----" + capitais.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima da capital parametrizada
        System.out.println(capitais.higherEntry("SC").getKey() + "-----" + capitais.higherEntry("SC").getValue());

        //Exibe todas as capitais no console
        System.out.println(capitais);

        Map.Entry<String, String> primeira = capitais.pollFirstEntry();
        Map.Entry<String, String> ultima = capitais.pollLastEntry();

        //Exibir a primeira capital no topo da árvore e remove do map
        System.out.println(primeira.getKey() + "-----" + primeira.getValue());

        //Exibir a primeira capital no final da árvore, removendo do map
        System.out.println(ultima.getKey() + "-----" + ultima.getValue());

        //Exibe as capitais no console
        System.out.println(capitais);

        //Navega sobre todas as capitais no console

        //Navega em todas as chaves do iterator
        Iterator<String> iterator = capitais.keySet().iterator();;

        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "--" + capitais.get(key));
        }

        for (String capital : capitais.keySet()) {
            System.out.println(capital + "----" + capitais.get(capital));
        }
        for (Map.Entry<String, String> capital: capitais.entrySet()) {
            System.out.println(capital.getKey() + "----" + capital.getValue());
        }

    }
}
