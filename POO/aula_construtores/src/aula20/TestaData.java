package aula20;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaData {

    public static void main(String[] args) {

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for (Date data : DateUtils.getProximosDias(new Date(), 10)) {
            System.out.println(data.toString());

        }
        for (Date data : DateUtils.getProximosDias(new Date(), 10)) {
            System.out.println(format.format(data));
        }

    }

}
