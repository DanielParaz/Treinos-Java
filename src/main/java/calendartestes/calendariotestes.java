package calendartestes;

import java.util.Calendar;

public class calendariotestes {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        System.out.printf(" A data corrente e: " + hoje.getTime());
        hoje.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás era: " + hoje.getTime());
        hoje.add(Calendar.YEAR, -250);
        System.out.println("A muito tempo atrás era: " + hoje.getTime());

    }
}