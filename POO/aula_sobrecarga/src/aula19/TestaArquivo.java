
package aula19;

import java.io.IOException;

public class TestaArquivo {
    public static void main(String[] args) {
        CriadorArquivo arquivo = new CriadorArquivo();
        
        try {
            arquivo.criarArquivo("nome do arquivo");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            
        }      
        
    }
    
}
