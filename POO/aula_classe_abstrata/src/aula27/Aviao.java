package aula27;

public class Aviao extends Veiculo {

    public Aviao(String cor, int qtdLugares, Pessoa pessoa) {
        super(cor, qtdLugares, pessoa);
    }

    @Override
    public void ligar() {
        System.out.println("Avião ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Avião desligado");
    }

    @Override
    public void locomover() {
        System.out.println("Avião locomovendo");
    }

}
