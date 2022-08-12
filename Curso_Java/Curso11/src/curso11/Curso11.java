/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso11;

import java.util.Arrays;

/**
 *
 * @author Thiago
 */
public class Curso11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double v[] = {3.5, 2.75, 9, -4.5};
        
        Arrays.sort(v);
        
        for(double valor: v){
            System.out.print(valor + ", ");
        }
    }
    
}
