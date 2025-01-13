import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date in dd/MM/yyyy format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = currentDate.format(formatter1);

        // Format the date in yyyy-MM-dd format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = currentDate.format(formatter2);

        // Format the date in EEE, MMM dd, yyyy format
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formattedDate3 = currentDate.format(formatter3);

        // Print the formatted dates
        System.out.println("Current date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Current date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}
