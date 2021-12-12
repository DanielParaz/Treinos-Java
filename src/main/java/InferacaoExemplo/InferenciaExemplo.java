package InferacaoExemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
//        Printarnomecompleto("João", "Paulo");
//        printarsoma2(5,5,5);
//        printarsoma(5,6);

        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlconnection = url.openConnection();
        try(var bufferedReader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()))){
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }catch (Exception e){
            e.printStackTrace();
        }




//        public static void Printarnomecompleto (String nome, String sobrenome) {
//            var nomecompleto = String.format("%s %s",nome,sobrenome);
//            System.out.println(nomecompleto);
//        }
//        public static void printarsoma (int a, int b) {
//        var sum = a+b;
//            System.out.println(sum);
//        }
//        public static void printarsoma2 (int... numeros) {
//        int soma;
//        if (numeros.length > 0) {
//            soma = 0;
//            for (var numero : numeros) {
//                soma+=numero;
//            }
//            System.out.println("A soma é: "+soma);
        }
    }
       //Consegue
       //consegue utilizar em variaveis locais inicializadas
       //variavel suporte do enhanced for
       //variavel suporte do for interativo
       //Varuavek try with resource


        //Não consegue
        // Var não pode ser utilizado em nível de class
        // Var não pode ser utilizado como parametro
        // var não pode ser utilizada em variaveis locais não inicializadas




