package Polimorfismo;

public class TesteContabilidade {

    public static void main(String[] args) {

        Contabilidade contabilidade = new Contabilidade();

        contabilidade.gerarDemonstrativo(new FuncionarioClt());
        contabilidade.gerarDemonstrativo(new FuncionarioPj());

    }

}
