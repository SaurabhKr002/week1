import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter; // Import DateTimeFormatter class

public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {
        // Get the current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        // Format the time in a readable format
        String formattedGmtTime = gmtTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        // Get the current time in IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        // Format the time in a readable format
        String formattedIstTime = istTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        // Get the current time in PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        // Format the time in a readable format
        String formattedPstTime = pstTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        // Print the current times in different time zones
        System.out.println("Current time in GMT: " + formattedGmtTime);
        System.out.println("Current time in IST: " + formattedIstTime);
        System.out.println("Current time in PST: " + formattedPstTime);
    }
}
