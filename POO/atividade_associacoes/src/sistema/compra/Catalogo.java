package sistema.compra;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private String titulo;
    List<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<>();
        this.titulo = titulo;
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
