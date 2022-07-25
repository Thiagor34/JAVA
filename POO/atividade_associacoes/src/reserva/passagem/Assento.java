package reserva.passagem;

import java.util.ArrayList;
import java.util.List;

public class Assento {

    private String posicao;
    private List<Categoria> categoria;

    public Assento(String posicao, List<Categoria> categoria) {
        this.posicao = posicao;
        this.categoria = categoria;
    }

    public Assento(String posicao, Categoria categoria) {
        this.posicao = posicao;
        this.categoria = new ArrayList();
        this.categoria.add(categoria);
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }
}
