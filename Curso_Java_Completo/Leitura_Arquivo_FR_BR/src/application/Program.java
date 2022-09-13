package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "c:\\Users\\Thiago\\OneDrive\\Documentos\\Intellij\\CursosUdemy\\JavaCompleto\\Leitura_arquivo_FR_BR\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();        //lê uma linha e se for a última trás um null

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
