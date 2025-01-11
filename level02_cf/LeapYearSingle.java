import java.util.Scanner;

public class LeapYearWithSingleOperator{
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid as per the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year " + year + " is before the Gregorian calendar has started.");
        } else {
            // Check if the year is a leap year using multiple conditions
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
		
		//Scanner closed
        input.close();
    }
}