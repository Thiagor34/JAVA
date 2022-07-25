package reserva.passagem;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {

    private String nome;
    private String sobrenome;
    private boolean vegetariano;
    private CartaoFidelidade cartao;
    List<Reserva> reserva;

    public Passageiro(String nome, String sobrenome, boolean vegetariano, CartaoFidelidade cartao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.vegetariano = vegetariano;
        this.cartao = cartao;
        this.reserva = new ArrayList();
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

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public CartaoFidelidade getCartao() {
        return cartao;
    }

    public void setCartao(CartaoFidelidade cartao) {
        this.cartao = cartao;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }

}
