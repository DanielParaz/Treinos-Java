package MapTreeComparator;

import org.springframework.boot.info.InfoProperties;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;



public class MapTreeFeito {
    public static void main(String[] args) {
        Map<String, Integer> mapaexercicio = new HashMap<>();

        mapaexercicio.put("Cacedonia", 50);
        mapaexercicio.put("Imperatriz", 20);
        mapaexercicio.put("Pau Brasil", 100);
        mapaexercicio.put("Manga", 35);
        mapaexercicio.put("Banana", 45);
        mapaexercicio.put("Prerou", 32);
        mapaexercicio.put("Caxixe", 34);
        mapaexercicio.put("Acerola", 69);

        Map<String, Integer> resultado = mapaexercicio.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        resultado.forEach((k,v) -> System.out.println(k+""+v));




    }
}
