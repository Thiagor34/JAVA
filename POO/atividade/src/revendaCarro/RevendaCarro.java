package revendaCarro;

import java.util.LinkedList;
import java.util.Scanner;

public class RevendaCarro {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        LinkedList carros = new LinkedList<>();
        String continuar = "S", verificar = "", vender = "", entrada = "", entrada1 = "", novoCarro = "", saida = "";

        System.out.println("---- Obrigatório inserir 6 Carros ----");

        for (int indice = 1; indice < 6; indice++) {
            System.out.print("Inserir Carro: ");
            carros.add(input.nextLine());
        }

        do {
            System.out.print("Inserir Carro: ");
            carros.add(input.nextLine());
            System.out.print("Continuar inserindo?[S/N] ");
            continuar = input.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.print("\nEm Estoque: " + carros + "\n");
        System.out.print("\nDeseja comprar qual Carro? ");
        verificar = input.nextLine();

        if (carros.contains(verificar)) {
            System.out.print("\nVerificando.... Disponível para compra!\n");
            System.out.print("\nDeseja comprar o Carro?[S/N] ");
            vender = input.nextLine();
            if (vender.equalsIgnoreCase("S")) {
                System.out.print("\nDeseja dar carro na troca?[S/N] ");
                entrada = input.nextLine();
            } else {
                System.out.print("\n----- Procura Finalizada! ----\n");
                System.out.print("\nCarros em Estoque: " + carros + "\n");
            }

        } else if (carros.contains(verificar) != true) {
            System.out.print("\nNão possuímos este carro em estoque!\n");
            System.out.print("\nComprar outro Carro?[S ou N para Sair] ");
            vender = input.nextLine();
            if (vender.equalsIgnoreCase("S")) {
                System.out.print("\nDeseja comprar qual Carro? ");
                verificar = input.nextLine();
                System.out.print("\nDeseja dar carro na troca?[S/N] ");
                entrada1 = input.nextLine();

                switch (entrada1) {
                    case "S","s":
                        System.out.print("\nQual carro? ");
                        novoCarro = input.nextLine();
                        carros.set(carros.indexOf(verificar), novoCarro);
                        System.out.print("\nCarros em Estoque: " + carros + "\n");
                        break;
                    case "N","n":
                        carros.remove(verificar);
                        System.out.print("\nVendido: " + verificar);
                        System.out.print("\nCarros em Estoque: " + carros + "\n");
                        break;
                }
            } else if (vender.equalsIgnoreCase("N")) {
                System.out.print("\n----- Procura Finalizada! ----\n");
                System.out.print("\nCarros em Estoque: " + carros + "\n");
            }
        }

        switch (entrada) {
            case "S","s":
                System.out.print("\nQual carro? ");
                novoCarro = input.nextLine();
                carros.set(carros.indexOf(verificar), novoCarro);
                System.out.print("\nCarros em Estoque: " + carros + "\n");
                break;
            case "N","n":
                carros.remove(verificar);
                System.out.print("Vendido: " + verificar);
                System.out.print("\nCarros em Estoque: " + carros + "\n");
                break;
        }
    }
}
