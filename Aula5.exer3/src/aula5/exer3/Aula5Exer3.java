/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5.exer3;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula5Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escolha um mês do ano (1 à 12): ");
        int mes = leia.nextInt();
        
        if (mes > 12) {
            System.out.println("Digite um número válido!");
        }
        
        switch (mes){
            case 1:
                System.out.println("Mês - Janeiro - 31 dias!");
                break;
            case 2:
                System.out.println("Mês - Fevereiro - 28 dias!");
                break;
            case 3:
                System.out.println("Mês - Março - 31 dias!");
                break;
            case 4:
                System.out.println("Mês - Abril - 30 dias!");
                break;
            case 5:
                System.out.println("Mês - Maio - 31 dias!");
                break;
            case 6:
                System.out.println("Mês - Junho - 30 dias!");
                break;
            case 7:
                System.out.println("Mês - Julho - 31 dias!");
                break;
            case 8:
                System.out.println("Mês - Agosto - 31 dias!");
                break;
            case 9:
                System.out.println("Mês - Setembro - 30 dias!");
                break;
            case 10:
                System.out.println("Mês - Outubro - 31 dias!");
                break;
            case 11:
                System.out.println("Mês - Novembro - 30 dias!");
                break;
            case 12:
                System.out.println("Mês - Dezembro - 31 dias!");
                break;
        }
    }
    
}
