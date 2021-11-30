package calendartestes;

import java.text.DateFormat;
//import java.util.Calendar;
import java.util.Date;

public class CalendarioFormatacaoEmDateFormat {
    public static void main(String[] args) {

       // Calendar datainteira = Calendar.getInstance();



        Date formatdatafacil = new Date();

        String dataformatada = DateFormat.getDateInstance().format(formatdatafacil);

        System.out.println(dataformatada);

        dataformatada = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(formatdatafacil);

        System.out.println(dataformatada);

        dataformatada = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(formatdatafacil);

        System.out.println(dataformatada);



    }
}
