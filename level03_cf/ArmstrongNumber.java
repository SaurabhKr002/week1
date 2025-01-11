import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
		
        //Scanner created		
        Scanner input = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

 
        int sum = 0;

   
        int originalNumber = number;

        //While loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            //Find the remainder of the number (last digit)
            int remainder = originalNumber % 10;

            //Find the cube of the digit and add it to the sum
            sum += remainder * remainder * remainder;

            //Find the quotient and assign it to the originalNumber
            originalNumber /= 10;
        }

        // Check if the sum and the original number are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
		
		//Scanner closed
		input.close();
    }
}
