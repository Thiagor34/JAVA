
package aula21;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Endereco> enderecos;
    
    public Pessoa() {
        enderecos = new ArrayList<>();
    }
    
    public void adicionarEndereco(Endereco endereco) throws NullPointerException{
        if (endereco == null 
                || endereco.getRua() == null 
                || endereco.getRua().equals(" ")) {
            throw new NullPointerException("Endereço inválido");
        }
        enderecos.add(endereco);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


}
