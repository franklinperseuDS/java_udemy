package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

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

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003 ,"BOB", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 00.1);

        //DownCasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

//        BusinessAccount acc5 = (BusinessAccount) acc3; //Erro de casting pois uma SavingAccount não é uma BusinessAccount
        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("LOAN!!!!!");;
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE!!!");
        }



    }
}
