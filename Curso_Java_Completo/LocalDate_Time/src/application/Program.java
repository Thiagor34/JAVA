package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d01 = LocalDate.now();
        System.out.println("Data: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data e hora: " + d02);

        Instant d03 = Instant.now();
        System.out.println("Data e Hora Global: " + d03.toString());

        LocalDate d04 = LocalDate.parse("2022-08-11");
        System.out.println("Data fixa: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-08-11T10:38:25");
        System.out.println("Data e hora fixa: " + d05);

        Instant d06 = Instant.parse("2022-08-11T10:38:40Z");
        System.out.println("Data e Hora global fixa: " + d06);

        Instant d07 = Instant.parse("2022-08-11T10:38:40-03:00");
        System.out.println("Data e Hora global fixa com fuso: " + d07);

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Data formatada: " + d08);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Data e hora formatada: " + d09);

        LocalDate d10 = LocalDate.of(2022, 8, 11);
        System.out.println("Data: " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 8, 11, 10, 53);
        System.out.println("Data e Hora: " + d11);
    }
}
