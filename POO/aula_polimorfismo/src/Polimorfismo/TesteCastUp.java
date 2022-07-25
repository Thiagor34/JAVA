package Polimorfismo;

public class TesteCastUp {

    public static void main(String[] args) {

        //  objeto declarado e instanciado
        Cliente c = new Cliente();
        // casting up explicito do objeto da classe cliente para classe pessoa
        Pessoa p = (Pessoa) c;
        // casting up do objeto da classe cliente para classe pessoa
        Pessoa p2 = c;
        // casting up do objeto da classe cliente para classe pessoa
        Pessoa p3 = new Cliente();
        // casting up explicito do objeto da classe cliente para classe object
        Object o = (Object) c;
        // casting up do objeto da classe cliente para classe object
        Object o2 = c;

    }

}
