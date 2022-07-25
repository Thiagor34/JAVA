package Atividade_POO;

public class TesteImposto {

    public static void main(String[] args) {
        Conta c1 = new Conta("1002");

        System.out.println("=-=-= Extrato Bancários =-=-=");
        c1.deposito(2500.00);
        c1.saque(2000.00);
        c1.deposito(325.78);
        c1.getSaldo();
        c1.imprimeDados();

        Conta c2 = new Conta("1003");

        System.out.println("=-=-= Extrato Bancários =-=-=");
        c2.deposito(10000.00);
        c2.saque(2000.00);
        Conta.setTaxaImposto(0.050);
        c2.saque(2000.00);
        c2.saque(700.00);
        c2.deposito(57.50);
        c2.deposito(123.45);
        c2.imprimeDados();

    }

}
