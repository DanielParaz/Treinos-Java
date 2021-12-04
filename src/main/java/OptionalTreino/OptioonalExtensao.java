package OptionalTreino;

import java.util.Optional;

public class OptioonalExtensao {
    public static void main(String[] args) {
        Optional<String> optionalstring = Optional.of("Valor Opcional");

        System.out.println(optionalstring.isPresent());
        System.out.println(optionalstring.isEmpty());

        optionalstring.ifPresent(System.out::println);

        optionalstring.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

        if (optionalstring.isPresent()) {
            String valor = optionalstring.get();
            System.out.println(valor);
        }

        optionalstring.map((valor) -> valor.concat("++++")).ifPresent(System.out::println);

        optionalstring.orElseThrow(IllegalStateException::new);

    }
}

