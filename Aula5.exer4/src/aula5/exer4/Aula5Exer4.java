/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5.exer4;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula5Exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe um nº inteiro: ");
        int n1 = leia.nextInt();
        System.out.print("Informe outro nº inteiro: ");
        int n2 = leia.nextInt();
        
        System.out.print("Qual operação deseja realizar (+ - * /)? ");
        String escolha = leia.next();
             
        switch(escolha){
            case "+":
                System.out.println("Soma: " + (n1+n2));
                break;
            case "-":
                System.out.println("Subtração: " + (n1-n2));
                break;
            case "*":
                System.out.println("Multiplicação: " + (n1*n2));
                break;
            case "/":
                System.out.println("Divisão: " + (n1/n2));
                break;        
        }
    }
    
}
