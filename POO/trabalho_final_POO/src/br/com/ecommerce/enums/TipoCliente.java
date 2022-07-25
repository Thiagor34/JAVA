package br.com.ecommerce.enums;

public enum TipoCliente {
    PESSOA_FISICA("PF"),
    PESSOA_JURIDICA("PJ");

    private final String tipo;

    private TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

}
