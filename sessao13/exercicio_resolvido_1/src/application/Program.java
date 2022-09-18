package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Worker worker;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departament = sc.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base Salary: ");
        double salary = sc.nextDouble();

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        worker = new Worker(name, WorkerLevel.valueOf(level),salary, new Departament(departament));
        for (int i = 1; i <= n;  i++) {
            System.out.println("Enter contract #"+i+" data:");
            System.out.print("DATE (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (Hour): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: "+worker.getName());
        System.out.println("Departament: "+worker.getDepartament().getName());
        double income = worker.income(year,month);
        System.out.printf("Income for %s: %.2f",monthAndYear,income);


        sc.close();
    }
}
