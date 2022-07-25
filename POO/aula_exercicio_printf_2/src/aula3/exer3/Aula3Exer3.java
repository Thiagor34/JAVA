/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3.exer3;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula3Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //preco de cada um dos três produtos
        
        System.out.print("Valor da 1ª caixa de bombom: ");
        double  p1 = scanner.nextDouble();
        System.out.print("Valor da 2ª caixa de bombom: ");
        double  p2 = scanner.nextDouble();
        System.out.print("Valor da 3ª caixa de bombom: ");
        double  p3 = scanner.nextDouble();
        
        //calculo da média
        
        double media = (p1 + p2 + p3) / 3;
        
        //
        
        System.out.printf("Caixa 1: %.2f \nCaixa 2: %.2f \nCaixa 3: %.2f \nPreço médio: %.2f \n",p1, p2, p3, media);
        
        
        
    }
    
}
