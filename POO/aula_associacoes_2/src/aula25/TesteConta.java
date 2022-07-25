
package aula25;

public class TesteConta {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("1708");
        Cliente cliente = new Cliente("Thiago");
        Conta conta1 = new Conta(1000, "12345-6", cliente , agencia);
        conta1.saque(1000);
        conta1.saque(800);

        ContaEspecial conEsp = new ContaEspecial(2000, "12345-7", cliente, agencia);
        conEsp.setLimite(3500.00);
        
        ContaPoupanca conPou = new ContaPoupanca(1500, "12345-8", cliente, agencia);
        conPou.setDataAniversario("01/06/2022");
        
        conPou.imprimeDados();

    }
    
}
