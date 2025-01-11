import java.util.Scanner;

class DivisiblityByFive {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a number - ");
		int inputNumber = input.nextInt();
		boolean DivisibleByFive;
		
        // Checking if the number is divisible by 5
        if (inputNumber % 5 == 0) {
            DivisibleByFive = true;
        } else {
            DivisibleByFive = false;
        }

		// Printing the results
		System.out.println("Is the number " + inputNumber + " divisible by 5? " + DivisibleByFive);
		
		//input close
		input.close();
    }
}
