package br.com.ecommerce.operacao;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDoce {

    private String nomeCatalogo;
    public List<Produto> produtos;

    public CatalogoDoce() {
        produtos = new ArrayList<>();
        this.nomeCatalogo = nomeCatalogo;
        this.produtos = produtos;
    }

    public String getNomeCatalogo() {
        return nomeCatalogo;
    }

    public void setNomeCatalogo(String nomeCatalogo) {
        this.nomeCatalogo = nomeCatalogo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
