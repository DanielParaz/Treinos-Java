package Stream;


import java.util.stream.IntStream;

public class Testedestream {

    public static void main(String[] args) {
        var nome = 5000;
        IntStream.range(50 , 533).map(r -> (nome * r)).forEach(System.out::println);
    }
}



