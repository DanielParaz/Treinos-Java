package JavaCollectionsTreino;

import java.util.List;
import java.util.Vector;

public class TreinoComFactor {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("futebol");
        esportes.add("basquetebol");
        esportes.add("tenis de mesa");
        esportes.add("handebol");

        esportes.set(2, "Ping Pong");

        esportes.remove(2);

        esportes.remove("handebol");

        System.out.println(esportes.get(0));

        for (String esporte: esportes) {
            System.out.println("navegando por ----> " + esporte);
        }





    }
}
