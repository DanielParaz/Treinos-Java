package maps;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ExerciciosMapTree {
    public static void main(String[] args) {
        TreeMap<String, String> estadosbrasileiros = new TreeMap<>();
        estadosbrasileiros.put("AC", "Acre");
        estadosbrasileiros.put("AP", "Amapa");
        estadosbrasileiros.put("AM", "Amazonas");
        estadosbrasileiros.put("PA", "Para");
        estadosbrasileiros.put("RO", "Rondonia");
        estadosbrasileiros.put("RR", "Roraima");
        estadosbrasileiros.put("TO", "Tocantis");
        estadosbrasileiros.put("AL", "Alagoas");
        estadosbrasileiros.put("BA", "Bahia");
        estadosbrasileiros.put("CE", "Ceara");
        estadosbrasileiros.put("MA", "Maranhao");
        estadosbrasileiros.put("PB", "Paraiba");
        estadosbrasileiros.put("PE", "Pernambuco");
        estadosbrasileiros.put("PI", "Piaui");
        estadosbrasileiros.put("RN", "Rio Grande do Norte");
        estadosbrasileiros.put("ES", "Espirito Santo");
        estadosbrasileiros.put("GO", "Goias");
        estadosbrasileiros.put("MT", "Mato Grosso");
        estadosbrasileiros.put("MS", "Mato Grosso do Sul");
        estadosbrasileiros.put("MG", "Minas Gerais");
        estadosbrasileiros.put("SP", "São Paulo");
        estadosbrasileiros.put("RJ", "Rio de Janeiro");
        estadosbrasileiros.put("PR", "Paraná");
        estadosbrasileiros.put("RS", "Rio Grande do Sul");
        estadosbrasileiros.put("SC", "Santa Catarina");

        System.out.println(estadosbrasileiros);

        estadosbrasileiros.remove("MG");

        estadosbrasileiros.put("DF", "Distrito Federal");

        System.out.println(estadosbrasileiros);

        System.out.println(estadosbrasileiros.size());

        estadosbrasileiros.remove("MS");

        for (Map.Entry<String, String> navegarestados : estadosbrasileiros.entrySet()) {
            System.out.println(navegarestados.getValue() + "(" + navegarestados.getKey() + ")");
        }
        System.out.println(estadosbrasileiros.containsKey("SC"));

        System.out.println(estadosbrasileiros.containsValue("Maranhao"));




    }
}
