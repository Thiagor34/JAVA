package br.com.senac.entidades;

import java.time.LocalDate;

public class Produto {

    private Long id;
    private String nome;
    private double preco;
    private LocalDate dataVencimento;

    public Produto() {
    }

    public Produto(String nome, double preco, LocalDate dataVencimento) {
        this.nome = nome;
        this.preco = preco;
        this.dataVencimento = dataVencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getVencimento() {
        return dataVencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.dataVencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", dataVencimento=" + dataVencimento + '}';
    }

}
