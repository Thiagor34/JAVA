package exercOito; 
import java.util.Scanner;
public class ExercOito {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        System.out.print("Deseja alterar qual palavra da frase? ");
        String palavraAntiga = input.nextLine();
        System.out.print("Digite a nova palavra: ");
        String palavraNova = input.nextLine();
        
        frase = frase.replace(palavraAntiga, palavraNova);
        System.out.println("Frase reformulada: " + frase);        
    }    
}
