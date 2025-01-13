import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = scanner.next();
        
        // Close the Scanner object
        scanner.close();
        
        // Parse the input date string into LocalDate
        LocalDate inputDate = LocalDate.parse(inputDateStr);
        
        // Add 7 days, 1 month, and 2 years to the input date
        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks from the modified date
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        
        // Format the final date in a readable format
        String formattedFinalDate = finalDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        // Print the final date
        System.out.println("Final date after performing the arithmetic operations: " + formattedFinalDate);
    }
}
