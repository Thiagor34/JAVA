package aula25;

public class Conta {

    protected double saldo;
    private String numero;
    private static double taxaIFN = 0.038;
    private Cliente titular;
    private Agencia agencia;

    protected double totalDesconto;

    public Conta(double saldo, String numero, Cliente titular, Agencia agencia) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
        this.agencia = agencia;
    }

    public void saque(double valor) {
        saldo -= valor;
        acumularIFN(valor);
    }

    protected void acumularIFN(double valorSaque) {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void imprimeDados() {
        System.out.println("-----------------");
        System.out.println("Cliente: " + titular.getNome());
        System.out.println("Número Agência: " + agencia.getNumero());
        System.out.println("Número Conta: " + numero);
        System.out.println("Saldo Conta: " + saldo);
        System.out.println("Taxa IFN: " + taxaIFN);
    }

}
