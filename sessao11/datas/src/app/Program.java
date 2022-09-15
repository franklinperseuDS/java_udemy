package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2002-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2002-07-20T01:30:26");
        Instant d06 = Instant.parse("2002-07-20T01:30:26Z");
//        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //BUG

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);


        System.out.println("Local Date: "+d01);
        System.out.println("Local Date Time: "+d02);
        System.out.println("Instant: "+d03);
        System.out.println("Local parse: "+d04);
        System.out.println("Local DATE TIME parse: "+d05);
        System.out.println("INSTANT parse: "+d06);
//        System.out.println("INSTANT parse -04 horas: "+d07);
        System.out.println("LocalDate custom: "+d08);
        System.out.println("LocalDateTime custom: "+d09);
    }
}
