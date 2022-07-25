
package aula21dois;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Pessoa> pessoas;
    
    public Departamento() {
        pessoas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    
    
}
