package Polimorfismo;

public class Contabilidade {

    public void gerarDemonstrativo(Funcionario funcionario) {
        System.out.println("O funcionário: " + funcionario.getNome());
        System.out.println("Recebeu o pagamento de: " + funcionario.calculaPagamento());
    }

}
