
package exercDois;
import java.util.Scanner;
public class ExercDois {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");

        String palavra = input.nextLine();

        while (palavra.length() < 2) {
                System.out.print("Digite uma palavra maior: ");
                palavra = input.nextLine();
        }
            StringBuilder reverso = new StringBuilder(palavra);

            palavra = reverso.reverse().toString();
            System.out.println("Palavra invertida: " + palavra);
        }
    }


