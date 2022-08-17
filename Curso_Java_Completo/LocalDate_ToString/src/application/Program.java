package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d04 = LocalDate.parse("2022-08-11");
        System.out.println("Data fixa: " + d04.format(fmt1));
        System.out.println("Data fixa: " + fmt1.format(d04));
        System.out.println("Data fixa: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();

        LocalDateTime d05 = LocalDateTime.parse("2022-08-11T10:38:25");
        System.out.println("Data e hora fixa: " + d05.format(fmt1));
        System.out.println("Data e hora fixa: " + d05.format(fmt2));
        System.out.println("Data e hora fixa: " + d05.format(fmt4));
        System.out.println();

        Instant d06 = Instant.parse("2022-08-11T01:38:40Z");
        System.out.println("Data e Hora global fixa: " + fmt3.format(d06));
        System.out.println("Data e Hora global fixa: " + fmt5.format(d06));
        System.out.println("Data e Hora global fixa: " + d06.toString());

    }
}
