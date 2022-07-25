package Atividade_POO;

public class Conta {

    private String numero;
    private double saldo;
    private double acumularImposto;

    private static double taxaImposto = 0.038;

    public Conta(String numero) {
        this.numero = numero;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println(String.format("Deposito: %.2f ", valor));
    }

    public void saque(double valor) {
        saldo -= valor;
        acumularImposto(valor);
        System.out.println(String.format("Saque: %.2f ", valor));
    }

    public void imprimeDados() {
        System.out.println("=-=-=- Dados Bancários -=-=-=");
        System.out.println(String.format("Número Conta: %s", this.numero));
        System.out.println(String.format("Taxa Imposto: %.3f", getTaxaImposto()));
        System.out.println(String.format("Imposto Acumulado: %.2f", getImpostoAcumulado()));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("-------------//-------------");
        System.out.println();
    }

    public double getSaldo() {
        return saldo;
    }

    public static double getTaxaImposto() {
        return taxaImposto;
    }

    public static void setTaxaImposto(double taxa) {
        taxaImposto = taxa;
    }

    private void acumularImposto(double valorSaque) {
        acumularImposto += valorSaque * getTaxaImposto();
    }

    public double getImpostoAcumulado() {
        return acumularImposto;
    }

}
