package Suppliers;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
//        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        System.out.println(instanciaPessoa.get());
    }
}


class Pessoa {
    private final String nome;
    private final Integer idade;

    public Pessoa(){
        nome = "Daniel";
        idade = 21;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " idade: " + idade;
    }
}