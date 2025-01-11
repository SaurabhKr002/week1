import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
	
	    // Created scanner
        Scanner input = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Handle negative numbers by converting them to positive using Math.abs
        number = Math.abs(number);

        int count = 0;

        // Special case: If the number is 0, it has exactly one digit
        if (number == 0) {
            count = 1;
        } else {
            // Use a while loop to count the digits
            while (number != 0) {
                number = number / 10; // Remove the last digit by dividing the number by 10
                count++;              // Increment the digit count
            }
        }

        // Displaying the result
        System.out.println("The number of digits is: " + count);

         //Scanner closed
        input.close(); 
    }
}
