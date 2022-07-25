package reserva.passagem;

public class PagamentoDescontoCarteira extends FormaPagamento {

    private String tipoDesconto;

    public PagamentoDescontoCarteira(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public String getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }
}
