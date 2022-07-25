package Polimorfismo;

public class TesteOperadorInstanceOf {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Pessoa pessoa = new Funcionario();
        //Pessoa pessoa = new Cliente();

        if (pessoa instanceof Cliente) {
            Cliente c = (Cliente) pessoa;
            System.out.println("Cpf: " + c.getCpf());
        } else if (pessoa instanceof Funcionario) {
            Funcionario c = (Funcionario) pessoa;
            System.out.println("Salário: " + c.getSalario());                    
        } else {
            System.out.println("Não é cliente e não é funcionário!");
        }
    }

}
