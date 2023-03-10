import sun.lwawt.macosx.CSystemTray;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.temporal.ChronoUnit.MINUTES;
import static java.util.Calendar.*;
import static java.time.temporal.ChronoUnit.*;

public class Main {
    public static void main(String[] args) {


        /*
        LocalDateTime currentDateTime= LocalDateTime.now();

        System.out.println("Current Date and Time: "+currentDateTime);

        ZoneId systemZoneId=ZoneId.systemDefault();

        ZoneId targetZoneId= ZoneId.of("America/Los_Angeles");
        ZonedDateTime targetDateTime=ZonedDateTime.of(currentDateTime,systemZoneId)
                                        .withZoneSameInstant(targetZoneId);
        System.out.println("Date and Time in Los Angeles Time Zone: " + targetDateTime);
    */
        /*
        ZoneId USEast = ZoneId.of("America/New_York");
        LocalDate date = LocalDate.of(2014, MARCH, 23);
        LocalTime time = LocalTime.of(9, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime courseStart = ZonedDateTime.of(date, time, USEast);
        ZonedDateTime hereNow = ZonedDateTime.now(USEast).truncatedTo(MINUTES);
        System.out.println("Here now: " + hereNow);
        System.out.println("Course start: " + courseStart);
        ZonedDateTime newCourseStart = courseStart.plusDays(2).minusMinutes(30);
        System.out.println("New Course Start: " + newCourseStart);
*/
        /*
        LocalDateTime meeting =LocalDateTime.now().plusDays(3);
        ZoneId SanFran = ZoneId.of("America/Los_Angeles");
        ZonedDateTime staffCall = ZonedDateTime.of(meeting, SanFran);
        OffsetDateTime  offsetDateTime= staffCall.toOffsetDateTime();
        System.out.println(offsetDateTime);
*/
        /*
        Instant now = Instant.now();
        try {
            Thread.sleep(0,1); // long milliseconds, int nanoseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant later = Instant.now();
        System.out.println("now is before later? " + now.isBefore(later));
        System.out.println("Now: " + now);
        System.out.println("Later: " + later);
*/
/*
        Period oneDay = Period.ofDays(1);
        System.out.println("Period of one day: " + oneDay);
        LocalDateTime beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
        ZonedDateTime newYorkTime =
                ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
        System.out.println("Before: " + newYorkTime);
        System.out.println("After: " + newYorkTime.plus(oneDay));
*/
/*
        Duration one24hourDay = Duration.ofDays(1);
        System.out.println("Duration of one day: " + one24hourDay);
        LocalDateTime beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
        ZonedDateTime newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
        System.out.println("Before: " + newYorkTime);
        System.out.println("After: " + newYorkTime.plus(one24hourDay));

        LocalDate newyear = LocalDate.of(2033, DECEMBER, 31);
        LocalDate today = LocalDate.now();
        long days = DAYS.between(today, newyear);
        System.out.println("There are " + days + " shopping days til Christmas");
*/
        /*
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a VV");
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(now.format(formatter));
*/
        LocalDate myBday = LocalDate.of(1970, 6, 11);
        System.out.println(myBday);
// A fluent approach
        myBday = Year.of(1970).atMonth(JUNE).atDay(11);
// Schedule a meeting fluently
        LocalDateTime meeting = LocalDate.of(2014, MARCH, 25).atTime(12, 30);
        System.out.println(meeting);
// Schedule that meeting using the London timezone
        ZonedDateTime meetingUK = meeting.atZone(ZoneId.of("Europe/London"));
        System.out.println(meetingUK);
// What time is it in San Francisco for that meeting?
        ZonedDateTime earlyMeeting = meetingUK.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println(earlyMeeting);
    }
}