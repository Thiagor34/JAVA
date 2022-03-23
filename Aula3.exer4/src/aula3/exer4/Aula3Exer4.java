/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3.exer4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula3Exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat decFormat = new DecimalFormat("0.00");
        
        System.out.print("Digite o Peso: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a Altura: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é: %.2f \n", imc);
        System.out.println("Seu IMC é: " + decFormat.format(imc));
        
    }
    
}
