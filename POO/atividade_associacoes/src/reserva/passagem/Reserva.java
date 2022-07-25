package reserva.passagem;

public class Reserva {

    private int codigo;
    private int data;
    private int dataLimite;
    private Voo voo;
    private Passageiro passageiro;
    private StatusReserva status;
    private FormaPagamento formaPagamento;

    public Reserva(int codigo, int data, int dataLimite, Voo voo, Passageiro passageiro,
             StatusReserva status, FormaPagamento formaPagamento) {
        this.codigo = codigo;
        this.data = data;
        this.dataLimite = dataLimite;
        this.voo = voo;
        this.passageiro = passageiro;
        this.status = status;
        this.formaPagamento = formaPagamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(int dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

}
