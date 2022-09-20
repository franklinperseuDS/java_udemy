package application;

import entities.Account;
import entities.BusinessAccount;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Herança");

        Account acc = new Account(1001,"Maria", 0.0);

        BusinessAccount bacc= new BusinessAccount(1002,"Jose",0.0,500);
        System.out.println(acc);
        acc.deposit(1000.00);
        System.out.println(acc);
        acc.withdraw(100.00);
        System.out.println(acc);
        System.out.println(bacc);
        bacc.loan(500.00);
        System.out.println(bacc);


    }
}
