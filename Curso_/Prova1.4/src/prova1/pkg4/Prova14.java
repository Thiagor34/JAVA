package prova1.pkg4;

import java.util.Scanner;

public class Prova14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = leia.nextInt();
        
        int antecessor = numero;
        int sucessor = numero;
       
        System.out.println("\nAntecessor: " + (--antecessor) + "\nSucessor: " + (++sucessor));
    }    
}
