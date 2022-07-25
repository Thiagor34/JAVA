package br.com.ecommerce.servicos;

public class TelaCliente {

    public static void imprimirPF() {
        pulaLinha();
        System.out.println("-----------------------------------------");
        System.out.println("-      DADOS CLIENTE PESSOA FISICA      -");
        System.out.println("-----------------------------------------");
    }

    public static void imprimirPJ() {
        pulaLinha();
        System.out.println("-----------------------------------------");
        System.out.println("-     DADOS CLIENTE PESSOA JURIDICA     -");
        System.out.println("-----------------------------------------");
    }

    public static void pulaLinha() {
        System.out.println();
    }

    public static void imprimirCabecalho() {
        System.out.println("-----------------------------------------");
        System.out.println("-  PRODUTO       QUANTIDADE      PREÇO  -");
    }

}
