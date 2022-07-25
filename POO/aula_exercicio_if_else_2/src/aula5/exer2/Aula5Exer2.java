/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5.exer2;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula5Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = leia.nextLine();
        System.out.print("Qual seu sexo (M ou F)? ");
        String sexo = leia.nextLine();
        System.out.print("Qual seu Peso? ");
        double peso = leia.nextDouble();
        System.out.print("Qual sua altura? ");
        double altura = leia.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println(imc);

        if (sexo.equalsIgnoreCase("F")) {
            if (imc <= 19.1) {
                System.out.println(nome + ", Sua Classificação é: Mulher Abaixo do peso");
            } else if (imc <= 25.8) {
                System.out.println(nome + ", Sua Classificação é: Mulher No peso ideal");
            } else if (imc <= 27.3) {
                System.out.println(nome + ", Sua Classificação é: Mulher Um pouco acima do peso");
            } else if (imc <= 32.3) {
                System.out.println(nome + ", Sua Classificação é: Mulher Acima do peso");
            } else {
                System.out.println(nome + ", Sua Classificação é: Mulher Obesa");
            }
        } else {
            if (imc <= 20.7) {
                System.out.println(nome + ", Sua Classificação é: Homem Abaixo do peso");
            } else if (imc <= 26.4) {
                System.out.println(nome + ", Sua Classificação é: Homem No peso ideal");
            } else if (imc <= 27.8) {
                System.out.println(nome + ", Sua Classificação é: Homem Um pouco acima do peso");
            } else if (imc <= 31.1) {
                System.out.println(nome + ", Sua Classificação é: Homem Acima do peso");
            } else {
                System.out.println(nome + ", Sua Classificação é: Homem Obeso");
            }
        }
    }

}
