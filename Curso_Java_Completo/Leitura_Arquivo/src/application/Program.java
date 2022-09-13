package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("c:\\Users\\Thiago\\OneDrive\\Documentos\\Intellij\\CursosUdemy\\JavaCompleto\\Leitura_arquivo\\in.txt");
        Scanner input = null;

        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }

    }
}
