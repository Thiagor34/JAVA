package aula25;

public class ContaPoupanca extends Conta {

    private String dataAniversario;

    public ContaPoupanca(double saldo, String numero, Cliente titular, Agencia agencia) {
        super(saldo, numero, titular, agencia);
    }
    
    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("-----------------");
        System.out.println("Data aniversário Poupança: " + getDataAniversario());
        System.out.println();
    }
}
