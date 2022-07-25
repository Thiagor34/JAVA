package aula19;

public class TestaConta {

    public static void main(String[] args) {
        try {
            Conta conta = new Conta();

            conta.setSaldo(600.00);
            System.out.println("Saldo: " + conta.getSaldo());
            conta.depositar(400.00);
            //conta.depositar(2000.00);
            conta.sacar(495.00);
            conta.sacar(550.00);
            conta.sacar(400.00);
            conta.sacar(300.00);
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (ContaException e) {
            System.err.println("" + e.getMessage());
        }

    }
    

}
