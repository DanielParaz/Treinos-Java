package Lambda;

public class LambdaAula {
    public static void main(String[] args) {
        funcao funcao1 = valor -> {
          return valor;
    };

        System.out.println(funcao1.gerar("Daniel"));

    }
}

