package exercSete;
import java.util.Scanner;
public class ExercSete {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Login: ");
        String login = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();
        
        if(login.equals("Admin") && senha.equals("123456")){
        System.out.println("Login e senha inseridos com sucesso!");
        } else {
            System.out.println("Login ou Senha inválido!");
        }                
    }    
}
