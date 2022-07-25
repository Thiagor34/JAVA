package reserva.passagem;

public class PagamentoCartaoCredito extends FormaPagamento {

    private String tipoPagamento;

    public PagamentoCartaoCredito(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

}
