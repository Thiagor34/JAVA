package aula7.exer;

import java.util.Scanner;

public class Aula7Exer {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor entre 1 e 10: ");
        int n = input.nextInt();

        if (n > 0 && n < 11) {

            for (int i = 1; i <= n; i++) {
                System.out.println("");
                for (int j = 1; j <= n; j++) {
                    System.out.print("# ");
                }
            }
        } else {
            System.out.println("Valor inválido");
        }
    }
}
