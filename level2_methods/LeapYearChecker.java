import java.util.Scanner;

public class LeapYearChecker {

    // Method to check for Leap Year
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for the year
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        // Checking if the year is a leap year
        boolean leapYear = isLeapYear(year);

        // Displaying the result
        if (leapYear) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }

        // Close the Scanner object
        sc.close();
    }
}
