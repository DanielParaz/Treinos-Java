package testes.da.aula.com;

import java.util.Arrays;

public class Exerciciosdaaula {

    public static void main(String[] args) {

        var nome = "André";
        var sobreNome = "Gomes";
        final var nomeCompleto = nome + sobreNome;

        var string = new String("1234 asda qw");

        System.out.println("Char na posição : " + string.charAt(5));
        System.out.println("Quantidade=" + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém M? " + string.contains("M"));
        System.out.println("Contém X? " + string.contains("X"));
        System.out.println("Replace " + string.replace("n", "$"));
        System.out.println("Equals? " + string.equals(" Minha String "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
        System.out.println("Substring(1,6)=" + string.substring(1, 6));

        System.out.println(Arrays.toString(string.toCharArray()));
        System.out.println(Arrays.toString(string.split(" ")));
        System.out.println(string.concat(" de Java "));
        System.out.println(string.replaceAll("[a,s,d,q,w,0-9]", "Cu"));

    }
}