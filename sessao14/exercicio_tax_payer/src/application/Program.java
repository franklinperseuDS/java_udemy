package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<TaxPayer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if( ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name,anualIncome,healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,anualIncome,numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for ( TaxPayer tp : list) {
            System.out.println(tp.getName()+": $ "+String.format("%.2f",tp.tax()));

        }
        for ( TaxPayer tp : list) {

            sum += tp.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f",sum);

//        3
//
//        i
//        Alex
//        50000.00
//        2000.00
//        Tax payer #2 data:
//        Individual or company (i/c)? c
//        Name: SoftTech
//        Anual income: 400000.00
//        25
//        Tax payer #3 data:
//        Individual or company (i/c)? i
//        Name: Bob
//        Anual income: 120000.00
//        Health expenditures: 1000.00
//        TAXES PAID:
//        Alex: $ 11500.00
//        SoftTech: $ 56000.00
//        Bob: $ 29500.00
//        TOTAL TAXES: $ 97000.00
    }
}
