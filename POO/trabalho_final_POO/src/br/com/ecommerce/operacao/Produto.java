package br.com.ecommerce.operacao;

public class Produto {

    private String nome;
    private String descricao;
    private String marca;
    private double preco;
    private String unidade;

    public Produto(String nome, String descricao, String marca, double preco, String unidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
        this.unidade = unidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

}
