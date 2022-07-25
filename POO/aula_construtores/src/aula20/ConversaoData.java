package aula20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoData {

    public static void main(String[] args) {
        String data = "2022-05-18 21:00:00";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(data, format);
        DateTimeFormatter formatB = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Data original: " + dateTime.format(formatB));
        System.out.println("Adicionando 4 horas...");
        System.out.println("Data atualizada: " + dateTime.plusHours(4).format(formatB));

    }

}
