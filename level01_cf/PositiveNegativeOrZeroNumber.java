import java.util.Scanner;

class PositiveNegativeOrZeroNumber {
    public static void main(String[] args) {
		
		//creating new scanner
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number - ");
        int number = input.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
		
		//scanner closed
        input.close();
    }
}
