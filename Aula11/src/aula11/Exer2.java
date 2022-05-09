package aula11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exer2 {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        List<String> bebidas = new LinkedList<>();
        String resposta = "S";
        
        while(resposta.equalsIgnoreCase("S")){
        System.out.print("Digite a Bebida: ");
        bebidas.add(input.nextLine());
            System.out.print("Continuar?[S/N] ");
            resposta = input.nextLine();
        }

        System.out.print("Verificar qual item? ");
        String entNome = input.nextLine();

        if (bebidas.contains(entNome)) {
            bebidas.remove(entNome);
            System.out.println("Produto retirado da lista : " + entNome);
        } else {
            System.out.println("Item não está na lista!");
        }
        System.out.println("Lista Att - " + bebidas.toString());

    }
}
 