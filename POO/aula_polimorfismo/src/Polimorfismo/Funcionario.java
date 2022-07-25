
package Polimorfismo;

public abstract class Funcionario extends Pessoa {
    private String carteiraProfissional;
    private double salario;

    public abstract double calculaPagamento();
    
    public String getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(String carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
 