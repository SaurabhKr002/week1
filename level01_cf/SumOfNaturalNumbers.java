import java.util.Scanner;

class SumOfNaturalNumbers{
    public static void main(String[] args) {
		
		//new scanner created
        Scanner input = new Scanner(System.in);
		
		// Taking input 
		System.out.print("Enter the number - ");
		int inputNumber = input.nextInt();
		
        // Check if the number is a natural number
        if (inputNumber > 0) {
		
            // Calculate the sum of the first n natural numbers
            int sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;
            System.out.println("The sum of the first " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number is not a natural number");
        }
		
		//input closed
		input.close();
    }
}
