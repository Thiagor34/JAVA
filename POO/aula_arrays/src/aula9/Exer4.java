package aula9;
import java.util.Scanner;
public class Exer4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra = "";

        System.out.print("Digite uma palavra: ");
        palavra = input.nextLine();

        while (palavra.length() < 2) {
            System.out.print("Digite uma palavra maior: ");
            palavra = input.nextLine();
        }
        char[] resposta = palavra.toCharArray();        
        int tamArray = resposta.length;        
        String resultado = "";
        
        for (int posicao = tamArray -1; posicao >= 0; posicao--) {
            resultado += resposta[posicao];            
        }
        System.out.println("Palavra invertida: " + resultado);
    }
}
