/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3.exer2;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula3Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço de Custo: ");
        double preco = scanner.nextDouble();
        
        double percentual = 0.65;
        
        double valorF = preco + (preco * percentual);
        
        System.out.printf("O preço de venda do produto %s é de R$%.2f.\n", nome, valorF);
        
        
    }
    
}
