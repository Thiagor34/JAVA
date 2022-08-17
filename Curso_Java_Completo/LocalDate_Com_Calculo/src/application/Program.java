package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-08-11");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-11T10:38:25");
        Instant d06 = Instant.parse("2022-08-11T01:38:40Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("PastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("PastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("NextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("PastWeekInstant: " + pastWeekInstant);
        System.out.println("NextWeekInstant: " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 Dias: " + t1.toDays());
        System.out.println("t2 Dias: " + t2.toDays());
        System.out.println("t3 Dias: " + t3.toDays());
        System.out.println("t4 Dias: " + t4.toDays());
    }
}
