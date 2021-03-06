package maps;

import java.util.HashMap;
import java.util.Map;

public class HasjMaps {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais fifa no mapa

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        //exibe os campeões mundias fifa e seus valores
        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave do Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe ou não um campeão Bélgica
        System.out.println(campeoesMundialFifa.containsKey("Bélgica"));

        //Remove o campeão França
        campeoesMundialFifa.remove("França");

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        //mostra os campeões mundiais fifa
        System.out.println(campeoesMundialFifa);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> navegarcampeoes : campeoesMundialFifa.entrySet()) {
            System.out.println(navegarcampeoes.getKey() + " -- " + navegarcampeoes.getValue());
        }
        // Navega nos registros do mapa
        for (String navegarcampeoes: campeoesMundialFifa.keySet()) {
            System.out.println(navegarcampeoes + "----" + campeoesMundialFifa.get(navegarcampeoes));
    }

        System.out.println(campeoesMundialFifa);

        //Verifica se o mapa contem a chave estados unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Verigica se o mapa contém um pentacampeão
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa.isEmpty());







    }
}
