package aula7.exer4;

import java.util.Scanner;

public class Aula7Exer4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int codProduto;
        int contador = 8;
        
        System.out.println("Inserir produtos de forma decrescente (8 até 1)");

        do {
            System.out.print("Cód do Produto: ");
            codProduto = input.nextInt();
            if(codProduto != 0){
                
            for (int i = 8; i >= 0; i--) {                
                for (int j = 1; codProduto % 2 == 0; j++) {
                    System.out.print("Corredor da Direita");
                    if (contador / codProduto == 1) {
                        System.out.print(" Gaveta nº(" + contador + ")" 
                                + " - Produto cód => " + codProduto + " <=\n");                        
                    }
                    break;                    
                }                
                for (int l = 1; codProduto % 2 == 1; l++) {
                    System.out.print("Corredos da Esquerda");
                    if(contador / codProduto == 1){
                        System.out.print(" Gaveta nº (" + contador + ")" 
                                + " - Produto cód => " + codProduto + " <=\n");
                    }
                    break;                    
                }
                contador--;
                break;
            }  
            }
        } while (codProduto != 0);
    }
}
    
