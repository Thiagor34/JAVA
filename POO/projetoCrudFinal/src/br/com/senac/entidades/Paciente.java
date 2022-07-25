package br.com.senac.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private List<Endereco> enderecos;

    public Paciente() {
        this.enderecos = new ArrayList();
    }

    public Paciente(String nome, String cpf, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.enderecos = new ArrayList();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", enderecos=" + enderecos + '}';
    }


        
}
