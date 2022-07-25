package reserva.passagem;

public class CalculadoraMilhagem {

    private Voo voo;

    public CalculadoraMilhagem(Voo voo) {
        this.voo = voo;
    }

    public static long calculaCustoEmMilhas(Voo trecho) {
        return trecho.getMilha() * 10;
    }

    public static long calculaMilhasGanhas(Voo trecho) {
        return trecho.getMilha() - (trecho.getDuracao() * 10);
    }

}
