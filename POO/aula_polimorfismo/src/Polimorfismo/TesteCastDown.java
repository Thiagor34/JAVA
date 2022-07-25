package Polimorfismo;

public class TesteCastDown {

    public static void main(String[] args) {
        //  objeto declarado e instanciado
        //Pessoa p = new Pessoa();
        Pessoa p = new Cliente();
        // casting down explicito do objeto da classe pessoa para classe cliente 
        Cliente c = (Cliente) p;
        
        
        Cliente c1 = new Cliente();
        // cast up de cliente para pessoa
        Pessoa p1 = c1;
        // cast down de pessoa para cliente
        Cliente c2 = (Cliente) p;
    }

}
