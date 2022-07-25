
package aula21tres;

public class Conta {
    private double saldo;
    private String numero;
    private double acumuladorIFN;
    
    private static double taxaIFN = 0.038;
    private Cliente titular;
    private Agencia agencia;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getAcumuladorIFN() {
        return acumuladorIFN;
    }

    public void setAcumuladorIFN(double acumuladorIFN) {
        this.acumuladorIFN = acumuladorIFN;
    }

    public static double getTaxaIFN() {
        return taxaIFN;
    }

    public static void setTaxaIFN(double taxaIFN) {
        Conta.taxaIFN = taxaIFN;
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
    
    
}
