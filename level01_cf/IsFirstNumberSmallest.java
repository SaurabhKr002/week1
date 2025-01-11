import java.util.Scanner;

public class IsFirstNumberSmallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking three numbers as input
        System.out.print("Please enter the first number: ");
        int firstNumber = input.nextInt();//First Number as input

        System.out.print("Please enter the second number: ");
        int secondNumber = input.nextInt();//Second Number as input

        System.out.print("Please enter the third number: ");
        int thirdNumber = input.nextInt();//Third Number as input
		
		boolean isFirstNumberSmallest;

        // Check if the first number is the smallest
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            isFirstNumberSmallest = true;
        } else {
            isFirstNumberSmallest = false;
        }

		System.out.println("Is the first number the smallest? " + isFirstNumberSmallest);
		
		//input closed
        input.close();
    }
}
