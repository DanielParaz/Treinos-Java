package time.in.milis;

import java.util.Date;

public class TimeInMillis {
    public static void main (String[] args) {
        Date meusquinze = new Date(1432004400000L);

        Date datadoexcercicio = new Date(1273892400000L);

        boolean isAfter = datadoexcercicio.after(meusquinze);
        System.out.println(isAfter);


    }

}
