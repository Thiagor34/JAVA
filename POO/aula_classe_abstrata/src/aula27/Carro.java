package aula27;

public class Carro extends Veiculo {

    public Carro(String cor, int qtdLugares, Pessoa pessoa) {
        super(cor, qtdLugares, pessoa);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void locomover() {
        System.out.println("Carro locomovendo");
    }

}
