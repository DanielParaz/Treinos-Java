package ComparatorsTreino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsListExample {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--- ordem natural dos núemros - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("---ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- ordem natural dos números - idade (metod reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println("--- ordem reversa dos números - idade(method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("--- ordem natural dos números - idade(interface comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("--- ordem reversa dos números - idade (interface comparable");
        System.out.println(estudantes);






    }

    public static class Estudante implements Comparable<Estudante> {

        private final String nome;
        private final Integer idade;

        public Estudante(String nome, Integer idade) {
            this.nome = nome;
            this.idade = idade;
        }
        public String getNome() {return nome; }

        public Integer getIdade() {return idade;}

        @Override
        public String toString() {return nome + " - " + idade; }

        @Override
        public int compareTo(Estudante o) {return this.getIdade() - o.getIdade();}
            }
}
