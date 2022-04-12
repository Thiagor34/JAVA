package aula10;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas linhas? ");
        int row = input.nextInt();
        System.out.print("Quantas colunas? ");
        int col = input.nextInt();

        int[][] matUm = new int[row][col];
        int[][] matDois = new int[row][col];
        int[][] matSoma = new int[row][col];

        for (int linha = 0; linha < matUm.length; linha++) {
            for (int coluna = 0; coluna < matUm[linha].length; coluna++) {
                System.out.println("Matriz 1 - L" + (linha + 1) + " / C" + (coluna + 1));
                System.out.print("Digite um número: ");
                matUm[linha][coluna] = input.nextInt();
            }
        }
        System.out.println("\nMatriz 1 Completa\n");

        for (int linha = 0; linha < matDois.length; linha++) {
            for (int coluna = 0; coluna < matDois[linha].length; coluna++) {
                System.out.println("Matriz 2 - L" + (linha + 1) + " / C" + (coluna + 1));
                System.out.print("Digite um número: ");
                matDois[linha][coluna] = input.nextInt();
            }
        }
        System.out.println("\nMatriz 2 Completa\n");
        System.out.println("=> Resulta da soma das Matrizes <=");

        for (int linha = 0; linha < matSoma.length; linha++) {
            for (int coluna = 0; coluna < matSoma.length; coluna++) {
                matSoma[linha][coluna] = matUm[linha][coluna]
                        + matDois[linha][coluna];
                System.out.print(" " + matSoma[linha][coluna] + " ");
            }
            System.out.println();
        }

    }

}
