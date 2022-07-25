package br.com.ecommerce.entidades;

import br.com.ecommerce.enums.TipoCliente;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cartaoCredito;
    private TipoCliente tipo;

    public Cliente(String nome, String sobrenome, String cartaoCredito, TipoCliente tipo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cartaoCredito = cartaoCredito;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getTipo() {
        return this.tipo.getTipo();
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

}
