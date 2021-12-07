package Iteracoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteracaoComplicadaeSimplificada {
    public static void main(String[] args) {
        String[] nomes = {"Joao","Joao", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosNomes(nomes);
//        ImprimirODobroDeCadaItemDaLista(numeros);
        List<String> ListaProfissões = new ArrayList<>();
        ListaProfissões.add("Desenvolvedor");
        ListaProfissões.add("Testador");
        ListaProfissões.add("Gerente de Projeto");
        ListaProfissões.add("Gerente de Qualidade");

        ListaProfissões.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")) {
                nomesParaImprimir += "" + nomes[i];
            }
        }
        // complicação acima
        //metodo melhor abaixo
        String nomesParaImprimir2 = Stream.of(nomes).filter(nome -> nome.equals("Joao"))
                        .collect(Collectors.joining()); //String


        System.out.println("Versão for it" + nomesParaImprimir);
        System.out.println("Versão lambda de iteração" + nomesParaImprimir2);

    }
    //metodo feio e errado
    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("Imprimir pelo for it: " + nome);
        }
        //metodo bonito e certo
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));
    }
    public static void ImprimirODobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero*2);
        }
        //metodo feito por mim
        Stream.of(numeros)
                .forEach(numero -> System.out.println("Numeros pelo forEach: " + numero*2) );
        //metodo do professor
        Stream.of(numeros)
                .map( numero -> numero*2)
                .forEach(System.out::println);
    }

}

