
package aula24;

public class Pessoa {
    protected String nome;
    protected String rg;
    protected Endereco endereco;

    public Pessoa(String nome, String rg, Endereco endereco) {
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    public void imprime() {
        System.out.println("------------");
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.print("Endereço: " + endereco.getRua());
        System.out.print(", " + endereco.getNumero());
        System.out.println("");        
    }
    
}
