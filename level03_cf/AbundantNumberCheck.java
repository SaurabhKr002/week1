import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Calculate sum of divisors
        int divisorSum 0;
		
		for (int i = 1; i <= number / 2; i++){ 
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        // Check if the number is abundant
        if (divisorSum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
		//Scanner closed
        input.close();
    }
}