/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Toolkit;

/**
 *
 * @author Thiago
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.awt.Dimension d = tk.getScreenSize();
        System.out.println("A Resolução da sua tela é: " +d.width + " x " +d.height);
               
        // TODO code application logic here
    }

    private static class Dimension {

        public Dimension() {
        }
    }
    
}
