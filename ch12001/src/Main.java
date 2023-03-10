import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate= LocalDate.now();
        System.out.println("Current date: "+currentDate);

        LocalTime currentTime=LocalTime.now();
        System.out.println("Current time: "+currentTime);

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println("Current Date and Time: "+currentDateTime);

        LocalDateTime joined= LocalDateTime.of(currentDate,currentTime);

        System.out.println("Joined: "+joined);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime=currentDateTime.format(formatter);

        System.out.println("Formatted Date and Time "+formattedDateTime);


        //System.out.println("Hello world!");
    }
}