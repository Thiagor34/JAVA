package reserva.passagem;

public class PagamentoMilhagem extends FormaPagamento {

    private String tipoMilhagem;

    public PagamentoMilhagem(String tipoMilhagem) {
        this.tipoMilhagem = tipoMilhagem;
    }

    public String getTipoMilhagem() {
        return tipoMilhagem;
    }

    public void setTipoMilhagem(String tipoMilhagem) {
        this.tipoMilhagem = tipoMilhagem;
    }
}
