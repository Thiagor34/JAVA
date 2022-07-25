package br.com.ecommerce.entidades;

import br.com.ecommerce.enums.TipoCliente;

public class ClientePJ extends Cliente {

    private String cnpj;

    public ClientePJ(String cnpj, String nome, String sobrenome, String cartaoCredito, TipoCliente tipo) {
        super(nome, sobrenome, cartaoCredito, tipo);
        this.cnpj = cnpj;
    }
        
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }   

}
