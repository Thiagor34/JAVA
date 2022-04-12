package exercQuatro;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ExercQuatro {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor a ser depositado: ");
        
        double valor = input.nextDouble();
        
        for(int i = 1; i <= 12; i++){
            valor = valor + (valor * 0.007);
        }
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$#,##0.00");
        System.out.println("Valor com rendimento após 12 meses: " + df.format(valor));        
    }    
}
