package calendartestes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTime {
    public static void main(String[] arg) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        LocalTime horahoje = LocalTime.now();

        LocalTime horamaisum = horahoje.plusHours(1);

        LocalDateTime exercicio = LocalDateTime.of(2010,5,15, 10, 0  );

        LocalDateTime exerciciofuturo = exercicio.plusYears(4).plusMonths(6).plusHours(13);

        LocalDateTime dataehora = LocalDateTime.now();

        LocalDateTime futoroooo = dataehora.plusHours(5).plusMinutes(30).plusSeconds(50).plusDays(130).plusMonths(10).plusYears(3);

        System.out.println(" Hoje e dia: " + hoje);

        System.out.println(" Ontem foi dia: " + ontem);

        System.out.println(" A hora atual e: " + horahoje);

        System.out.println(" Daqui uma hora sera: " + horamaisum);

        System.out.println(" A data e hora atual e: " + dataehora);

        System.out.println("Essa data e do futuroooo: " + futoroooo);

        System.out.println("Essa e a data pedida do futuro do exercicio" + exerciciofuturo);



    }
}
