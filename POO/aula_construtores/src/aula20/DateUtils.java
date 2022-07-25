package aula20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtils {

    public static Date adicionarDias(Date data, int qtdDias) {

        if (data == null) {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
        return calendar.getTime();
    }

    public static Boolean isFimSemana(Date data) {
        if (data == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        return (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

    public static List<Date> getProximosDias(Date data, int qtdDias) {
        if (data == null) {
            return null;
        }
        if (qtdDias <= 0) {
            return Arrays.asList(data);
        }
        List<Date> dates = new ArrayList<>();
        for (int i = 1; i <= qtdDias; i++) {
            Date novaData = adicionarDias(data, i);
            dates.add(novaData);            
        }
        return dates;
    }

}
