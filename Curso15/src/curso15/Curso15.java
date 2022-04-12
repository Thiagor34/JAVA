/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso15;

/**
 *
 * @author Thiago
 */
public class Curso15 {

    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
    
    static int subt(int a, int b){
        int s = a - b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5,2);
        
        int sub = subt(5,2);
        System.out.println("A subtração é: " +sub);
        
    }
    
}
