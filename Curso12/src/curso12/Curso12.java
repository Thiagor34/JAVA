/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso12;
import java.util.Arrays;
/**
 *
 * @author Thiago
 */
public class Curso12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]= {3,7,6,1,9,4,2};
        for(int v: vet){
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet,1);
        
        System.out.println("\nEncontrei o valor na posição " + p);
    }
    
}
