package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("exercise BANK account ");
        BankAccount bk;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit ( y/n)?");
        char initialDeposit = sc.next().charAt(0);


        if( initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double accountValue = sc.nextDouble();
            bk = new BankAccount(accountNumber, accountHolder, accountValue);
        }else {
            bk = new BankAccount(accountNumber, accountHolder);
        }
        System.out.println("Account data: ");
        System.out.println(bk);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bk.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(bk);

        System.out.print("Enter a withdrwa value: ");
        double withdrawValue = sc.nextDouble();
        bk.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(bk);

        sc.close();

    }
}
