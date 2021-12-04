package ExerciciosComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListadeCasas {
    public static void main(String[] args) {
        List<Casas> casas = new ArrayList<>();

        casas.add(new Casas("Apartamento Leblon", 324));
        casas.add(new Casas("Casa Macae", 323));
        casas.add(new Casas("Chalé Nova Fidel", 243));
        casas.add(new Casas("Jardim Fiel", 125));
        casas.add(new Casas("Istambul", 586));
        casas.add(new Casas("Jardim Botanico", 103));
        casas.add(new Casas("Casa Nova", 652));
        casas.add(new Casas("Chalé Rico", 654));
        casas.add(new Casas("Casa Feia", 320));
        casas.add(new Casas("Casa Npmota", 416));
        casas.add(new Casas("Apartamento Pretinha", 321));
        casas.add(new Casas("Apartamento Cu", 685));

        System.out.println(casas);

        casas.sort((first, second) -> first.getperimetro() - second.getperimetro());
        System.out.println("Ordem das casas e perimetros em ordem natural dos números");
        System.out.println(casas);

        casas.sort((first, second) -> second.getperimetro() - first.getperimetro());
        System.out.println("Ordem das casas e perimetros em ordem reversa dos numeros");
        System.out.println(casas);

        casas.sort(Comparator.comparingInt(Casas::getperimetro));
        System.out.println("Ordem das casas e perimetros em ordem natural(metod reference");
        System.out.println(casas);

        casas.sort(Comparator.comparingInt(Casas::getperimetro).reversed());
        System.out.println("Ordem das casas e perimetros em ordem reversa(metod reference");
        System.out.println(casas);

       Collections.sort(casas);

        System.out.println("ordem das casas e perimentros interface comparable");
        System.out.println(casas);

        Collections.sort(casas, new CasasReverse());
        System.out.println("ordem das csaas e perimetros reversa interface comparable");
        System.out.println(casas);







    }
}
