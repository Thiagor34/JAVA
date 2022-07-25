package aula11;

import java.util.ArrayList;
import java.util.List;

public class Aula11 {

    public static void main(String[] args) {
        // TODO code application logic here
        List<String> emails = new ArrayList<>();

        emails.add("teste@teste.com.br");
        emails.add("Magaiver@bol.com.br");

        System.out.println(emails.toString());

        emails.add("Surfista18sarado@uol.com.br");

        System.out.println(emails.toString());

        emails.add("Bruninha21@uol.com.br");

        System.out.println(emails.toString());

        String valor = emails.set(0, "josé@maria.com");
        System.out.println(valor);
        System.out.println(emails.toString());

        emails.clear();

        int indiceAcessar = 2;
        if (emails.size() > indiceAcessar) {
            String valorIndice2 = emails.get(indiceAcessar);
            System.out.println(valorIndice2);
        }

    }
}
