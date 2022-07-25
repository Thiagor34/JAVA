package aula1;

public class Pessoa {

    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        System.out.println("Alex Python");
        System.out.println(definirNome("Jonathan"));
        System.out.println("");
        System.out.println("   ||     //A     V    //     //A");
        System.out.println("   ||    //__A     V  //     //__A");
        System.out.println("||_||   //    A     V//     //    A");

        definirNome("Jonathan");

    }

    private static String definirNome(String nome) {
        return nome + " Seja bem vindo!";
    }
    
}
