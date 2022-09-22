package model.application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit:");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, name, initialBalance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.println("New balance: " + acc.getBalance());
        }catch(DomainException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
}
