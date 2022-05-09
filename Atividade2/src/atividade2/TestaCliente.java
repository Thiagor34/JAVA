package atividade2;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.codigo = 1;
        c1.nome = "Thiago";
        System.out.println("Código: " + c1.codigo + "\nNome: " + c1.nome);
        
        System.out.println();

        Cliente c2 = new Cliente();
        c2.codigo = 2;
        c2.nome = "Jonathan";
        System.out.println("Código: " + c2.codigo + "\nNome: " + c2.nome);

    }

}
