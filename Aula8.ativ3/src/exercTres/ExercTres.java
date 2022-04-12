package exercTres;
import java.util.Scanner;
public class ExercTres {
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        
        String palavra = input.nextLine();
        
        System.out.println("Sua palavra em Maiúsculo: " + palavra.toUpperCase());
    }    
}
