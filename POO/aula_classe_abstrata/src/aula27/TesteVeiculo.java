package aula27;

public class TesteVeiculo {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Thiago");
        Endereco endereco = new Endereco("Rua papagaio", 260);

        Veiculo carro = new Carro("Preto", 5, pessoa);

        System.out.println("Nome: " + pessoa.getNome() + "\nEndereço: "
                + pessoa.getEndereco() + "\nCor Carro: " + carro.getCor()
                + "\nQtd Lugares: " + carro.getQtdLugares());

        carro.ligar();
        carro.locomover();
        carro.desligar();

        Veiculo aviao = new Aviao("Branco", 160, pessoa);

        System.out.println("Nome: " + pessoa.getNome() + "\nEndereço: "
                + pessoa.getEndereco() + "\nCor avião: " + aviao.getCor()
                + "\nQtd Lugares: " + aviao.getQtdLugares());
        
        aviao.ligar();
        aviao.locomover();
        aviao.desligar();

    }
}
