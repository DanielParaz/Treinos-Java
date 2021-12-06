package FuncaoAltaOrdem;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (n1,n2) -> n1+n2;
        Calculo divisao = (n1,n2) -> n1/n2;
        Calculo multiplicacao = (n1,n2) -> n1*n2;
        Calculo subtracao = (n1,n2) -> n1-n2;
        System.out.println(executarOperacao(soma, 1 , 3));
        System.out.println(executarOperacao(divisao, 4 , 2));
        System.out.println(executarOperacao(multiplicacao, 7 , 3));
        System.out.println(executarOperacao(subtracao, 4 , 3));
    }
    public static int executarOperacao(Calculo calculo, int n1, int n2){
        return calculo.calculo(n1,n2);
    }
}
@FunctionalInterface
interface Calculo {
    public int calculo(int a ,int b);
}
//POR PARAMETRO RECEBE OUTRA FUNÇÃO
// OU ELA RETORNA OUTRA FUNÇÃO