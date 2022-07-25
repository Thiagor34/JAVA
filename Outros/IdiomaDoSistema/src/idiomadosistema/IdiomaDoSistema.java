/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Thiago
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do seu sistema é: ");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}


