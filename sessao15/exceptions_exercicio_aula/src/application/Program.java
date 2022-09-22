package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation res = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + res);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            res.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + res);

        }catch(ParseException e) {
            System.out.println("Invalid date format");
        }catch (DomainException e) {
            System.out.println("Error in reservation: "+ e.getMessage());

        }catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}
