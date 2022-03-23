/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4.exer3;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Aula4Exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");

        int num = leia.nextInt();
        boolean resto = (num % 2 == 0);

        String res;

        res = (resto == true) ? "PAR" : "IMPAR";

        System.out.println(res);

    }

}
