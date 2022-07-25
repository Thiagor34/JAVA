
package aula19;

import java.io.File;
import java.io.IOException;

public class CriadorArquivo {
        public void criarArquivo(String nomeArquivo) throws IOException {
            File file = new File(nomeArquivo);
            file.createNewFile();
            System.out.println("Criou arquivo com sucesso");
        }
    
}
