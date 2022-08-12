package prova1.pkg3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prova13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o Saldo a ser reajustado: ");
        double saldo = leia.nextDouble();
        double reajuste = 0.01;
        
        double novoSaldo = saldo+(saldo*reajuste);
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$#,##0.00");
        
        System.out.println("Novo Saldo: " + df.format(novoSaldo));
    }    
}
