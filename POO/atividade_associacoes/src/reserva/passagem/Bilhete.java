package reserva.passagem;

public class Bilhete {

    private Passageiro passageiro;
    private Voo voo;
    private Assento assento;
    private Reserva reserva;

    public Bilhete(Assento assento, Reserva reserva) {
        this.assento = assento;
        this.reserva = reserva;
        this.passageiro = reserva.getPassageiro();
        this.voo = reserva.getVoo();
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
