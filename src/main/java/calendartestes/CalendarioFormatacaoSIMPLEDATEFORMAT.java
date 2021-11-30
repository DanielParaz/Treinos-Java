package calendartestes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarioFormatacaoSIMPLEDATEFORMAT {
    public static void main (String[] args) {

        Date preformatada = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MMM/yyyy");

        SimpleDateFormat formatadorhora = new SimpleDateFormat("HH:mm:ss");

        String horaformatada = formatadorhora.format(preformatada);

        String formatada = formatador.format(preformatada);

        System.out.println("A data de hoje e: " + formatada);
        System.out.println("E a hora e: " + horaformatada);

    }
}
