package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-08-11");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-11T10:38:25");
        Instant d06 = Instant.parse("2022-08-11T01:38:40Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("Data global para Local: " + r1);
        System.out.println("Data global para Local: " + r2);
        System.out.println("Data e Hora global para Local: " + r3);
        System.out.println("Data e Hora global para Local: " + r4);
        System.out.println();

        System.out.println("Dia: " + d04.getDayOfMonth());
        System.out.println("Dia: " + d04.getMonthValue());
        System.out.println("Dia: " + d04.getYear());
        System.out.println();
        System.out.println("Hora: "+ d05.getHour());
        System.out.println("Hora: "+ d05.getMinute());

    }
}
