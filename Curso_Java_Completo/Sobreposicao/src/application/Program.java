package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        //sobreposição
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        //sobreposição e super
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
