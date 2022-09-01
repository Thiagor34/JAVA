package br.com.senac.entities;

/**
 *
 * @author Thiago
 */
public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private int estoque;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, String descricao, int estoque, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao="
                + descricao + ", estoque=" + estoque + ", preco=" + preco + '}';
    }

}
