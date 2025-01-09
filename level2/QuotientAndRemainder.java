// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;
// Creating a class for calculating Quotient and Remainder 
public class QuotientAndRemainder {
    public static void main(String[] args) { 
	// creating a input object of Scanner class 
        Scanner input = new Scanner(System.in);
	
        System.out.print("Enter the first number: ");
	// creating int type first variable for taking as input 
        int number1 = input.nextInt();
	// creating int type second variable for taking as input 
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
	// calculating quotient and storing it in quotient variable 
        int quotient = number1 / number2;
	// calculating remainder and storing it in int type variable 
        int remainder = number1 % number2;
	// displaying results of quotient and remainder S
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);
    }
}
