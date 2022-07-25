
package aula20;

import java.util.Date;

public class Produto {
    private String nome;
    private String marca;
    private double preco;
    private Date dataVencimento;

    public Produto(String nome, String marca, double preco, Date dataVencimento) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
       
    
}
