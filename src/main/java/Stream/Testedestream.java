package Stream;


import java.util.stream.IntStream;

public class Testedestream {

    public static void main(String[] args) {
        var nome = 10;
        IntStream.range(10 , 16).map(r -> (nome * r)).forEach(System.out::println);
    }
}



