package exercNove;
import java.util.Scanner;
public class ExercNove {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Compra de cavalos (qtd): ");
        int qtd = input.nextInt()*4;
        
        System.out.println("São necessárias " + qtd  
                + " ferraduras para equipar todos os cavalos");        
    }   
}
