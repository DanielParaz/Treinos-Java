package calendartestes;

import java.util.Calendar;

public class CalendarioExercicios {
    public static void main(String[] args) {

        Calendar datadevencimento = Calendar.getInstance();

        System.out.println("A data e horario da compra foi realizada dia: ");
        System.out.printf("%tc\n", datadevencimento);

        datadevencimento.add(Calendar.DATE, 10);

        System.out.println("A data de vencimento do boleto e dia: ");
        System.out.printf("%tF\n", datadevencimento);
        System.out.println("Em caso de vencimento no fim de semana, pagar na proxima segunda feira");

    }
}
