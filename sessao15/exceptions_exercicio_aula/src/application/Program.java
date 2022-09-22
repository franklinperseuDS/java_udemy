package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }else {
            Reservation res = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: "+res);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());


            String error =  res.updateDates(checkIn,checkOut);
            if(error != null) {
                    System.out.println(error) ;
            }
            else {
                System.out.println("Reservation: " + res);
            }

        }





        sc.close();
    }
}
