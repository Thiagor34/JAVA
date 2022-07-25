/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5.exer;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula5Exer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeiro nº: ");
        int n1 = leia.nextInt();
        System.out.print("Segundo nº: ");
        int n2 = leia.nextInt();
        System.out.print("Terceiro nº: ");
        int n3 = leia.nextInt();

        if (n1 != n2 && n1 != n3 && n2 != n3) {

            if (n1 > n2 && n1 > n3) {
                System.out.println(n1);
            }
            if (n2 > n1 && n2 > n3) {
                System.out.println(n2);
            }
            if (n3 > n1 && n3 > n2) {
                System.out.println(n3);
            }
        } else {
            System.out.println(" Existem números iguais.. Tente novamente!");
        }
        
    }

}
