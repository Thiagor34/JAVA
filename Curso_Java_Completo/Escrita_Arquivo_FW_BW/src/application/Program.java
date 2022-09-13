package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
        String path = "C:\\Users\\Thiago\\OneDrive\\Documentos\\Intellij\\CursosUdemy\\JavaCompleto\\Leitura_arquivo_FW_BW\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {       //true ele não recria o arquivo, só acrescenta dentro dele
            for ( String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
