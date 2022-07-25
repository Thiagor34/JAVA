package aula24;

public class Funcionario extends Pessoa {

    private long carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public void impressaoRecibo(int dia, int mes, int ano) {
        System.out.println("---- RECIBO PAGAMENTO ----");
        System.out.println("Eu " + super.nome + ", portador do RG nº ");
        System.out.println(super.rg + " ........ ");
        System.out.println("Ref. pag, no dia " + dia + "/" + mes + "/" + ano);
        System.out.println("--------------------------");
    }

    public Funcionario(String nome, String rg, Endereco endereco) {
        super(nome, rg, endereco);
    }

    public long getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(long carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("------------");
        System.out.println("Carteira Prof: " + carteiraProfissional);
        System.out.println("Salário: " + salario);
        System.out.println("Data Admissão: " + dataAdmissao);
        System.out.println("");
    }
}
