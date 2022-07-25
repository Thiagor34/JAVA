package aula7.exer2;

import java.util.Scanner;

public class Aula7Exer2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantas sequências deseja obter? ");
        int qtd = input.nextInt();
        
        long anterior = 0;
        long proximo = 1;
        
        for (long i = 1; i <= qtd; i++){
            System.out.print(anterior + ", " + proximo + ", ");
            anterior += proximo;
            proximo += anterior;
        }
    }
    
}
