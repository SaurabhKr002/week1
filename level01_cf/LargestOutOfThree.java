import java.util.Scanner;

class LargestOutOfThree {
    public static void main(String[] args) {
		
		//Creating new scanner
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first number -  ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number - ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number -  ");
        int thirdNumber = input.nextInt();

        // Initial results
        boolean IsFirstLargest = false;
        boolean IsSecondLargest = false;
        boolean IsThirdLargest = false;

        // Determine largest number
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            isFirstLargest = true;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            isSecondLargest = true;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            isThirdLargest = true;
        }
		
		//Printing the output
        System.out.println("Is the first number the largest? " + IsFirstLargest);
        System.out.println("Is the second number the largest? " + IsSecondLargest);
        System.out.println("Is the third number the largest? " + IsThirdLargest);

        // Closed the scanner
        input.close();
    }
}
