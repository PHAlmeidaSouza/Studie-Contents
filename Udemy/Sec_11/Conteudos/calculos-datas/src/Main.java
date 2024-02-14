import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-20T20:42:01");
        Instant d06 = Instant.parse("2024-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        /*
            Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
            Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        */

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        //Duration t3 = Duration.between(pastWeekInstant, d05);
        //Duration t4 = Duration.between(d05, pastWeekInstant);

        System.out.println();
        System.out.println("==================================================");
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);
        System.out.println("==================================================");
        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);
        System.out.println("==================================================");
        /*
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);
        */
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        //System.out.println(t3.toDays());
        //System.out.println(t4.toDays());
        System.out.println("==================================================");


    }
}