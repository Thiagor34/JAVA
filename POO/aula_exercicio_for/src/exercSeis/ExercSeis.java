package exercSeis;
import java.util.Scanner;
public class ExercSeis {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Qual tabuada deseja visualizar? ");
        
        int tab = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(tab + " X " + i + " = " + (tab * i));            
        }        
    }    
}
