package StreamExercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;


public class StreamExercicio {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Carlinhos", 35, "Quarta"));
        estudantes.add(new Estudante("Marcos", 23, "Quinta"));
        estudantes.add(new Estudante("Pedro", 18, "Sexta"));
        estudantes.add(new Estudante("Juninho", 40, "Terceiro"));
        estudantes.add(new Estudante("Daniel", 18, "Segundo"));
        estudantes.add(new Estudante("Gabriel", 24, "Quinto"));

        System.out.println("Lista de estudantes em string" + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Essa lista de estudantes contem: " + estudantes.stream().count() + " Estudantes ");

        System.out.println("Estudantes acima de 18 anos: " + estudantes.stream().filter((estudante)
                -> estudante.getIdade().toString().contains("18")).collect(Collectors.toList()));

        System.out.println("Estudantes na lista");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Estudantes com a lebra B: " + estudantes.stream().filter((estudanteb) -> estudanteb.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Tem studantes com a ledra D nome" + estudantes.stream().anyMatch((elemento) -> elemento.getNome().toLowerCase().contains("d")));

        System.out.println("Estudante com maior idade da coleção" + estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)));

        System.out.println("Estudante com menor idade da coleção" + estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)));











    }
}
