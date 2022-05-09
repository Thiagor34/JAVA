package atividade2;

public class TestaConta {

    public static void main(String[] args) {

        Conta contaUm = new Conta();
        contaUm.numero = 23456;
        contaUm.depositar(2000.00);
        contaUm.sacar(875.90);
        contaUm.sacar(632.30);
        contaUm.depositar(25.00);
        contaUm.consultarSaldoDisponivel();
        contaUm.imprimirExtrato();

        System.out.println();

        Conta contaDois = new Conta();
        contaDois.numero = 963111; 
        contaDois.sacar(95.00);
        contaDois.depositar(150.00);
        contaDois.consultarSaldoDisponivel();
        contaDois.imprimirExtrato();
    }

}
