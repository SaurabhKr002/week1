import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the first date input in the format yyyy-MM-dd
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = scanner.next();

        // Read the second date input in the format yyyy-MM-dd
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = scanner.next();
        
        // Close the Scanner object
        scanner.close();

        // Parse the input date strings into LocalDate objects
        LocalDate firstDate = LocalDate.parse(firstDateStr);
        LocalDate secondDate = LocalDate.parse(secondDateStr);

        // Compare the dates using isBefore(), isAfter(), and isEqual() methods
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        } else {
            System.out.println("Invalid comparison.");
        }
    }
}
