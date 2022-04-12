package aula9;

import java.util.Arrays;
import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos produtos deseja inserir: ");
        int nQtd = input.nextInt();
        input.nextLine();
        String lista;

        String[] produtos = new String[nQtd];

        for (int i = 0; i < nQtd; i++) {
            System.out.print("Nome do produto " + "[" + i + "]: ");
            produtos[i] = input.nextLine();
        }
        Arrays.sort(produtos);
        System.out.println(Arrays.toString(produtos));
        }
    }


