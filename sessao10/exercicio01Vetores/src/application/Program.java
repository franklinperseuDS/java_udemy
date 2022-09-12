package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("A dona de um pensionato possui dez quartos para alugar para estudantes,\n" +
                "sendo esses quartos identificados pelos números 0 a 9.");

        Student[] student = new Student[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many rooms will be rented? ");
        int rented = sc.nextInt();



        for (int i = 0; i < rented; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n",(i+1));
            System.out.print("NAME: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomRented = sc.nextInt();
            student[roomRented] = new Student(name,email);

        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0 ; i < student.length; i++) {
            if(student[i] != null)
                System.out.println(i +": "+student[i]);
        }


       sc.close();




    }
}
