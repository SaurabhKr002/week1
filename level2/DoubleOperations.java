// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;
// Creating a class for Double Operation
public class DoubleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a: ");
	// taking first variable a as an input 
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
	// taking second variable b as an input 
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
	// taking third variable as input 
        double c = input.nextDouble();
	// Calculating required operations
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
	// Displaying Results as acquired 
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }
}
