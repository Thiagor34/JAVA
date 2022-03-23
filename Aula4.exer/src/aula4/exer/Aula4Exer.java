/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4.exer;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula4Exer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = leia.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura);

        boolean pMulher = (imc >= 19.1 && imc <= 25.8);
        boolean pHomem = (imc >= 20.8 && imc <= 26.4);
        
        boolean resultado = pMulher && pHomem;
        boolean resultado1 = pMulher || pHomem;
        
            System.out.println("Mulher e Homem no peso ideal? " + resultado);
            System.out.println("Mulher ou Homen no peso ideal? " + resultado1);

    }
}
