package calendartestes;

import java.util.Calendar;

public class calendarioformatacao {
    public static void main (String[] args) {

        Calendar testeformatacao = Calendar.getInstance();

        System.out.printf("%tc\n", testeformatacao);
        System.out.printf("%tF\n", testeformatacao);
        System.out.printf("%tD\n", testeformatacao);
        System.out.printf("%tr\n", testeformatacao);
        System.out.printf("%tT\n", testeformatacao);
    }
}
