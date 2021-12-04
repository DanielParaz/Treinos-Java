package OptionalTreino;

import java.util.Optional;

public class OptionalAula {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("Valor Opcional esta presente");
        optionalString.ifPresentOrElse(System.out::println, ()  -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente"));//

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não está presente"));

        Optional<String> optionalnullerro = Optional.of(null);

        System.out.println("Valor opcional não está presente e vai lançar um nullexception erro");
        optionalnullerro.ifPresentOrElse(System.out::println, () -> System.out.println("erro= não está presente"));

    }
}
