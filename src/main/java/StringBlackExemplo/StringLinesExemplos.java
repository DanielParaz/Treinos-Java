package StringBlackExemplo;

import java.util.stream.Collectors;

public class StringLinesExemplos {
    public static void main(String[] args) {
        String html = "html>\n<head>\n<head>\n<head>\n<body>\n<body>\nhtml";
        System.out.println(html.lines().map(s -> "[TAG] :: " + s).collect(Collectors.toList()));
    }
}