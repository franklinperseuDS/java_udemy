package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExercicioCalculoData {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("d01 = "+d01);
        System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("d02 = "+d02);
        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7,ChronoUnit.DAYS);

        System.out.println("d03 = "+d03);
        System.out.println("pastWeekInstant = "+pastWeekInstant);
        System.out.println("nextWeekInstant = "+nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime,d02);

        System.out.println("Duracao");
        System.out.println("t1 = "+t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(),d01.atStartOfDay());  //converter para localdateTime usando .atTime(0,0) ou .atStartOfDay()
        System.out.println("t2 = "+t2.toDays());


        Duration t3 = Duration.between(nextWeekInstant,d03);
        System.out.println("t3 = "+t3.toDays());
    }
}
