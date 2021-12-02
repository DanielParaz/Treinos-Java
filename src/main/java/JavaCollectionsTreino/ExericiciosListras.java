package JavaCollectionsTreino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExericiciosListras {

    public static void main(String[] args) {
        List<String> exercicio = new ArrayList<>();

        exercicio.add("Juliana");
        exercicio.add("Pedro");
        exercicio.add("Carlos");
        exercicio.add("João");
        exercicio.add("Larissa");

        System.out.println(exercicio);

        for (String exerciciolista: exercicio) {
            System.out.println("------>" + exerciciolista);
        }

        exercicio.set(2, "Roberto");

        System.out.println(exercicio);

        String posicao1 = exercicio.get(1);

        System.out.println(posicao1);

        exercicio.remove(4);

        System.out.println(exercicio);

        exercicio.remove("João");

        System.out.println(exercicio);

        int tamanholista = exercicio.size();

        System.out.println(tamanholista);

        boolean temjuliano = exercicio.contains("Juliano");

        System.out.println(temjuliano);

        List<String> novalista = new ArrayList<>();

        novalista.add("Ismael");
        novalista.add("Rodrigo");

        System.out.println(exercicio);

        System.out.println(novalista);

        exercicio.addAll(novalista);

        System.out.println(exercicio);

        Collections.sort(exercicio);

        System.out.println(exercicio);

        boolean tavazia = exercicio.isEmpty();

        System.out.println(tavazia);

















    }


    }

