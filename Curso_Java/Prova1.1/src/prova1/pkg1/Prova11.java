package prova1.pkg1;

import java.util.Scanner;

public class Prova11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade em Anos, Meses e Dias!");
        System.out.print("Quantos Anos? ");
        int ano = leia.nextInt() * 365;
        System.out.print("Quantos Meses? ");
        int meses = leia.nextInt() * 30;
        System.out.print("Quantos Dias? ");
        int dias = leia.nextInt() * 1;
        
        int total = ano + meses + dias;
        
        System.out.printf("\nVocê tem %d dias de vida!\n", total);
    }    
}
