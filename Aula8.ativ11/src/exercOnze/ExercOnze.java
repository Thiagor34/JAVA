package exercOnze;
import java.util.Scanner;
public class ExercOnze {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual valor do Salário Mínimo R$: ");
        double valorMinimo = input.nextDouble();
        System.out.print("Qual valor do Salário do Funcionário R$: ");
        double valorFuncionario = input.nextDouble();
        
        double resultado = valorFuncionario / valorMinimo;
        System.out.printf("O funcionário recebe %.2f salário(s) minímo(s)\n", resultado);       
    }    
}
