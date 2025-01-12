//importing Scanner class from util pkg
import java.util.Scanner;

import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given month and day fall in Spring Season and return a boolean value
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for month and day
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.println("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Checking if the given date is in Spring Season
        boolean isSpring = isSpringSeason(month, day);

        // Displaying the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // Close the Scanner object
        sc.close();
    }
}
