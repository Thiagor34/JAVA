package application;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Program {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2022-08-17T10:37:42Z"));
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        d = cal.getTime();

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        System.out.println(sdf.format(d));
    }
}
