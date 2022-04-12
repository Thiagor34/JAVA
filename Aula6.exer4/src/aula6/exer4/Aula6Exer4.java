package aula6.exer4;

import java.util.Scanner;

public class Aula6Exer4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int nP = 0;
        int nI = 0;
        String resposta = "";

        do {
            System.out.print("Digite um nº inteiro: ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                nP += num;
            } else {
                nI += num;
            }
            System.out.print("Deseja continuar(S/N)? ");
            resposta = input.next();
            
        } while (resposta.equalsIgnoreCase("S"));
        System.out.println("A soma dos Pares é: " + nP + "\nA soma dos Impares é: " + nI);
        }
    }
