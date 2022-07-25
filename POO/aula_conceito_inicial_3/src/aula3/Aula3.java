/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3;

/**
 *
 * @author Thiago
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //exemplo 1
        
        boolean bloqueado = true;
        bloqueado = !bloqueado;
        System.out.println(bloqueado);
        
        //exemplo 2
        
        int variavel1 = 10;
        int variavel2 = 20;
        boolean maior = (variavel1 > variavel2);
        System.out.println(!maior);
        
        //exemplo 3
        
        int x = 10;
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        
        //exemplo4
        
        int variavel = 10;
        variavel++;
        --variavel;
        variavel--;
        ++variavel;
        System.out.println(variavel);  
        
        //exemplo5
        
        double primN = 125;
        double segunN = 24;
        
        double mult = primN * segunN;
        double soma = primN + segunN;
        double subt = primN - segunN;
        double div = primN / segunN;
        double resto = primN % segunN;
        
        System.out.printf("Mult = %.2f Soma = %.2f Subt = %.2f Div = %.2f Resto = %.2f", mult, soma, subt, div, resto);
        
              
        
    }
    
}
