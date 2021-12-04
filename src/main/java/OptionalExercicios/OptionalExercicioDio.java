package OptionalExercicios;

import java.util.*;

public class OptionalExercicioDio {
    public static void main(String[] args) {
        HashMap<String, String> funcionarios = new HashMap<>();
        funcionarios.put("Pedrinho", "Pedrinho foi Demitido");
        funcionarios.put("Carlito", "Carlito Ainda Contratado");;

        String carademitido = funcionarios.get("Pedrinho");

        Optional<String> demitidosera = Optional.empty();
        Optional<String> demitido = Optional.of(carademitido);
        /*Optional<String> demitidoerro = Optional.of(null);*/
        Optional<String> demitidosemerro = Optional.ofNullable(null);

        demitido.ifPresent(System.out::println);

        demitido.orElseThrow(IllegalStateException::new);

        demitidosera.ifPresentOrElse(System.out::println, () -> System.out.println("Opcional Vazio"));

        demitidosemerro.ifPresentOrElse(System.out::println, () -> System.out.println(demitido.get()));

        if (demitido.isPresent()) {
            String Valor = demitido.get();
            System.out.println(Valor);

        }
        if (demitidosera.isEmpty()) {
            demitidosera.orElseThrow(NullPointerException::new);

        }





    }
}
