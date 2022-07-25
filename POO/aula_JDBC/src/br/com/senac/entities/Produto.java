package br.com.senac.entities;

import java.time.LocalDate;

public class Produto {
    private Long id;
    private String nome;
    private double preco;
    private LocalDate dataVencimento;

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

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    

}
