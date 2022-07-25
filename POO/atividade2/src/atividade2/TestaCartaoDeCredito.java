package atividade2;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {

        CartaoDeCredito cartaoUm = new CartaoDeCredito();
        cartaoUm.numero = 1234567890;
        cartaoUm.dataDeValidade = "25/04/2022";
        System.out.println("Número Cartão 1: " + cartaoUm.numero + "\nData de Validade: " + cartaoUm.dataDeValidade);
        
        System.out.println();

        CartaoDeCredito cartaoDois = new CartaoDeCredito();
        cartaoDois.numero = 1234098765;
        cartaoDois.dataDeValidade = "02/05/2022";
        System.out.println("Número Cartão 2: " + cartaoDois.numero + "\nData de Validade: " + cartaoDois.dataDeValidade);

    }

}
