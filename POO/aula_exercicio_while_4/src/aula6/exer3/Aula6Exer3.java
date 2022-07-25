package aula6.exer3;

import java.util.Scanner;

public class Aula6Exer3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um nº (0 para sair): ");
        int num = input.nextInt();
        int soma = 0;

        while (num != 0) {
            soma += num;

            System.out.print("Digite outro nº: ");
            num = input.nextInt();
        }
        System.out.println("A Soma é: " + soma);
    }

}
