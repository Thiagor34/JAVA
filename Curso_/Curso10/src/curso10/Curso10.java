/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso10;

/**
 *
 * @author Thiago
 */
public class Curso10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN",
            "JUL","AGO","SET","OUT","NOV","DEZ"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + 
                    " dias ao todo.");            
        }
    }
    
}
