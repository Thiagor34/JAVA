package aula14;

import java.util.Scanner;

public class PrincAeronaves {

    public static void main(String[] args) {
        // TODO code application logic here
        Aeronaves espacos = new Aeronaves();
        Scanner input = new Scanner(System.in);

        System.out.print("Total assentos: ");
        espacos.totalAssentos = input.nextInt();
        System.out.print("Total reservas: ");
        espacos.reservarAssentos(input.nextInt());
        System.out.println("Assentos disponíveis: " + espacos.calcularAssentosDisponiveis());

    }

}
