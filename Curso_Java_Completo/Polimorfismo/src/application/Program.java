package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //instanciando uma Account (comum)
        Account x = new Account(1020, "Alex", 1000.00);

        //instanciando uma Account (poupança) que não desconta taxa de saque
        Account y = new SavingsAccount(1023, "Maria", 1000.00, 0.01);

        //mesma operação com variáveis do mesmo tipo (x,y) com comportamentos diferentes (polimorfismo)
        x.withdraw(50.00);
        y.withdraw(50.00);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
