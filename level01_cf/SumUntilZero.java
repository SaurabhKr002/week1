import java.util.Scanner;

class SumUntilZero{
    public static void main(String[] args) {
		
		//scanner created
        Scanner input = new Scanner(System.in);

        int Sum = 0; // Initialize Sum
        int UserInput;  // Variable that stores user input

        // Taking input from user and continuing the process until 0 is entered by the user
        do {
            System.out.println("Please enter a Number (Enter 0 to stop) - ");
            UserInput = input.nextInt();
            Sum += UserInput; // Adding input to sum
        } while (UserInput != 0);
		
		//Printing the result
        System.out.println("The total sum is: " + Sum);
        
		//Scanner closed
		input.close();
    }
}
