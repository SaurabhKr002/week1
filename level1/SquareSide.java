//Importing Scanner class from util pkg for taking input from user 
import java.util.Scanner;
// Creating class for calculating side of the square 
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side length
        double side = perimeter / 4;

        // Print the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter + ".");
    }
}
