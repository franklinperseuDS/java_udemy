package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Collectors;

public class ExercicioConversaoData {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        /*    //Pegar as Zonas disponiveis
        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
        */

        LocalDate r1 = LocalDate.ofInstant(d03,ZoneId.systemDefault()) ;
        LocalDate r2 = LocalDate.ofInstant(d03,ZoneId.of("Portugal")) ;

        LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault()) ;
        LocalDateTime r4 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal")) ;

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("D02 dia = "+ d02.getDayOfMonth());
        System.out.println("D02 mês = "+ d02.getMonthValue());
        System.out.println("D02 ano = "+ d02.getYear());

        System.out.println("D02 hora = "+ d02.getHour());
        System.out.println("D02 Minuto = "+ d02.getMinute());
        System.out.println("D02 segundo = "+ d02.getSecond());

    }
}
