package aula13;

import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculos = new Calculadora();
        
        int numUm;
        int numDois;

        System.out.print("Digite um Número: ");
        numUm = input.nextInt();
        System.out.print("Digite outro Número: ");
        numDois = input.nextInt();

        System.out.println("Soma: " + calculos.somar(numUm, numDois));
        System.out.println("Subtração: " + calculos.subtrair(numUm, numDois));
        System.out.println("Multiplicação: " + calculos.multiplicar(numUm, numDois));
        System.out.println("Divisão: " + calculos.dividir(numUm, numDois));
        System.out.println("Número 1 Maior: " + calculos.maior(numUm, numDois));

    }

}
