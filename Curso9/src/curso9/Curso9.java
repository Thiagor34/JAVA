/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso9;

/**
 *
 * @author Thiago
 */
public class Curso9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N é " + n.length);
        
        for (int c = 0; c <= n.length-1; c++) {
            System.out.println("Na posição " + c + " temos o nº " + n[c]);            
        }
    }    
}
