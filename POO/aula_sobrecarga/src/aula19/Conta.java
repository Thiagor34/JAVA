package aula19;

public class Conta{

    private int numero;
    private double saldo;

    public void depositar(double valor) throws ContaException {
        if (valor > 1000){
            throw new ContaException("O valor não pode ser superior a R$1.000,00");
        } else {
            saldo += valor;
            System.out.println("Valor depositado na conta: R$ " + valor);
        }
    }

    public void sacar(double valor) throws ContaException {
        if (valor > 500 || valor > saldo){
            throw new ContaException("O valor não pode ser superior a R$500,00 ou Saldo Zero");
        } else {
            saldo -= valor;
            System.out.println("Valor sacado: R$ " + valor);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
