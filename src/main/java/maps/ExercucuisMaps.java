package maps;

import java.util.HashMap;
import java.util.Map;

public class ExercucuisMaps {
    public static void main(String[] args) {
        Map<String, String> estadosbrasileiros = new HashMap<>();
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

        System.out.println("Verifica se minas sumiu" + estadosbrasileiros);

        System.out.println(estadosbrasileiros.containsKey("MG"));

        estadosbrasileiros.put("DF", "Distrito Federal");

        System.out.println("adiciona distrito federal:" + estadosbrasileiros);

        System.out.println(estadosbrasileiros.size());

        estadosbrasileiros.remove("MS");

        System.out.println("removi mato grosso?: " + estadosbrasileiros);

        for (Map.Entry<String, String> cudosestados : estadosbrasileiros.entrySet()) {
            System.out.println(cudosestados.getValue() + "------" + cudosestados.getKey());

        }

        System.out.println(estadosbrasileiros.containsKey("SC"));

        System.out.println(estadosbrasileiros.containsValue("Maranhao"));




    }

}