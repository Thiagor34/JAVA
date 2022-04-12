package aula6.exer2;

import java.util.Scanner;

public class Aula6Exer2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nº inteiro: ");
        int num = input.nextInt();

        while (num != 1) {
            if (num % 2 == 0) {
                System.out.println("Par - " + num);
                num /= 2;
            } else {
                System.out.println("Impar - " + num);
                num = ((num * 3) + 1) / 2;
            }
        }
        System.out.println("Valor N - " + num);
    }

}
