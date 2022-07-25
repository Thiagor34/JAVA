package aula7.exer6;
import java.util.Scanner;
public class Aula7Exer6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codProduto = 0;
        String lados = "";

        do {
            System.out.print("Código do Produto: ");
            codProduto = input.nextInt();

            if (codProduto != 0) {
                lados = (codProduto % 2 == 0) ? "Direita" : "Esquerda";

                for (int i = 8; i >= 1; i--) {

                    if (codProduto % i == 0) {
                        System.out.println("Corredor da " + lados + " Gaveta nº ("
                                + i + ") = Produto Inserido => " + codProduto + " <=");
                        break;
                    }
                }
            }
        } while (codProduto != 0);
    }
}
