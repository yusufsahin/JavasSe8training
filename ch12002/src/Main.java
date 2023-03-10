import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {
        LocalDate now,bDate,nowPlusMonth,nextTues;

        now= LocalDate.now();
        System.out.println("Now "+now);

        bDate=LocalDate.of(1995,5,23);
        System.out.println("Javas's Bday "+bDate);

        System.out.println("Is Java's  Bday in the past? "+bDate.isBefore(now) );
        System.out.println("Is Java's  Bday in a leap year "+bDate.isLeapYear());
        System.out.println("Is Java's  Bday day of the week: "+bDate.getDayOfWeek());

        nowPlusMonth=now.plusMonths(1);
        System.out.println("The date a month from now: " + nowPlusMonth);

        nextTues = now.with(next(TUESDAY));
        System.out.println("Next Tuesday's date: " + nextTues);

    }
}