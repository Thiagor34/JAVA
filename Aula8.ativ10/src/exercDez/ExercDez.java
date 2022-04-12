package exercDez;
import java.util.Scanner;
public class ExercDez {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma frase para contagem de caracteres: ");
        String frase = input.nextLine();
        
        int total = frase.length();
        System.out.println("Total de caracteres com espaços: " + total);
        
        int totalSemEspaco = frase.replace(" ", "").length();
        System.out.println("Total de caracteres sem espaços: " + totalSemEspaco);
    }    
}
