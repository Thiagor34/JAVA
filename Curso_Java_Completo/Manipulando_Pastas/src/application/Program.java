package application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o caminho da pasta: ");
        String strpath = input.nextLine();

        File path = new File(strpath);
        File[] folders = path.listFiles(File::isDirectory);     //lista somente quem é diretório(pasta)
        System.out.println("\nPastas: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);        //lista somente quem é arquivo
        System.out.println("Arquivos: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strpath + "\\teste").mkdir();     //criando uma pasta
        System.out.println("Pasta criada com sucesso!");
    }
}
