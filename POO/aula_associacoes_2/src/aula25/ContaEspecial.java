package aula25;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(double saldo, String numero, Cliente titular, Agencia agencia) {
        super(saldo, numero, titular, agencia);
    } 
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void saque(double valor) {
        super.totalDesconto += 0.10;
        valor += 0.10;
        super.saque(valor);
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("-----------------");
        System.out.println("Limite Especial: " + getLimite());
        System.out.println();
    }
}
