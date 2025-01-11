import java.util.Scanner;

public class LeapYearComputation {
    public static void main(String[] args) {
	
	    // Created a Scanner
        Scanner input = new Scanner(System.in);


        //taking user input
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is in the Gregorian calendar
        if (year >= 1582) {
		
            // Single if condition using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        } else {
            System.out.println("The year " + year + " is not valid as it's before 1582.");
        }
		
		//Scanner closed
        input.close();
    }
}



