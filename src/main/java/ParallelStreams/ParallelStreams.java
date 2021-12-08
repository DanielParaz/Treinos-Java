package ParallelStreams;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreams {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num)); //Serial stream
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de Execução Serial: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num)); //Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de Execução Parallel: "+(fim-inicio));

        List<String> nomes = Arrays.asList("João", "Paulo", "Oliveira", "Santos");
        nomes.parallelStream().forEach(System.out::println);



    }
    public static long fatorial(long num){
        int fat = 1;

        for (int i = 2; i <= num ; i++){
            fat*=i;

        }
        return fat;
    }

}
