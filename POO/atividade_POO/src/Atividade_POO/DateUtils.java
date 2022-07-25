package Atividade_POO;

import java.util.Calendar;

public class DateUtils {

    public static int getHoraAtual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static String imprimir() {
        if (getHoraAtual() > 6 && getHoraAtual() <= 12) {
            return ("Hora agora: " + getHoraAtual() + " hora(s). Bom dia!");
        }
        if (getHoraAtual() > 13 && getHoraAtual() <= 18) {
            return ("Hora agora: " + getHoraAtual() + " hora(s). Boa tarde!");
        } else {
            return ("Hora agora: " + getHoraAtual() + " hora(s). Boa noite!");
        }
    }
}
