package br.com.ecommerce.entidades;

import br.com.ecommerce.enums.TipoCliente;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(String cpf, String nome, String sobrenome, String cartaoCredito, TipoCliente tipo) {
        super(nome, sobrenome, cartaoCredito, tipo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
