import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result variable
        int result = 1;

        // Calculating the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        //Printing the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
		
		//Scanner closed
        input.close();
    }
}
