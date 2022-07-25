
package aula19;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("numero: ");
        int num = input.nextInt();
        int soma = 0;
        
        while (num>0) {
            soma +=(num%10);
            num /=10;
        }
        System.out.println(soma);
    }

    
}
