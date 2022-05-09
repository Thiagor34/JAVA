package aula16;

public class Gerente {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario() {
        this.aumentarSalario(0.1);
    }

    public void aumentarSalario(double taxa) {
        this.salario += getSalario() * (taxa);
    }

}
