/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3.exer;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula3Exer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro nº: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo nº: ");
        double n2 = scanner.nextDouble();
        
        double soma = n1 + n2, subt = n1 - n2, mult = n1 * n2, div = n1 / n2, resto = n1 % n2;
        
        System.out.printf("Resultado: \n Soma: %.2f \n Subt: %.2f \n Mult: %.2f \n Div: %.2f \n Resto: %.2f \n", soma, subt, mult, div, resto);
        
    }
    
}
