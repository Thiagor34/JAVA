package atividade2;

public class Conta {

    public int numero;
    public double saldo;
    public double limite = 100;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if ((limite + saldo) >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("************************************");
            System.out.println("Não há saldo suficiente para saque...");
        }
    }

    public double consultarSaldoDisponivel() {
        System.out.printf("\nConsulta de saldo: R$ %.2f\n", saldo);
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("------------------------------------");
        System.out.printf("Conta nº: %d \nLimite: R$ %.2f "
                + "\nExtrato: R$ %.2f\n", numero, limite, (saldo + limite));
        System.out.println("------------------------------------");
    }

}
