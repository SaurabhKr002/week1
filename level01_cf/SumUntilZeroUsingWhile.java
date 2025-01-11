import java.util.Scanner;

class SumUntilZeroUsingWhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Sum = 0; // Initialize Sum

        // Taking input from user and continuing the process until 0 is entered
        while (true) {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            int userInput = input.nextInt();
            if (userInput == 0) {
                break; // Exit the loop if input is 0
            }
            Sum += userInput; // Add input to Sum
        }
		
		//Printing the Output
        System.out.println("The total sum is: " + Sum);
		
		//Scanner Closed
        input.close();
    }
}
