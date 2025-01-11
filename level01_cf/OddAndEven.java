import java.util.Scanner;

public class OddAndEven{
    public static void main(String[] args) {
		
		// Scanner created
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number - ");
        int Limit = input.nextInt();

        // Check if the input is a natural number
        if (Limit <= 0) {
            System.out.println("Enter a natural number");
        } else {
            // Iterate from 1 to the number and check odd/even
            for (int currentNumber = 1; currentNumber <= Limit; currentNumber++) {
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an even number");
                } else {
                    System.out.println(currentNumber + " is an odd number");
                }
            }
        }
		
		//Scanner closed
        input.close();
    }
}
