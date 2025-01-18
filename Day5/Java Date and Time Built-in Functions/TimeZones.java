import java.time.ZonedDateTime;  // importing ZonedDateTime
import java.time.ZoneId; // importing ZoneId

public class TimeZones {
    public static void main(String[] args) {

        // displaying the current time in different time zones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT")); // time in GMT zone
        System.out.println("GMT time: " + gmtTime);

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // time in IST zone
        System.out.println("IST time: " + istTime);

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // time in PST zone
        System.out.println("PST time: " + pstTime);

    }
}
