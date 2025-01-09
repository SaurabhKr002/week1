//Importing Scanner class from util pkg for taking input from user 
import java.util.Scanner;
// Creating class for calculating area of triangle 
public class TriangleArea {
    public static void main(String[] args) { 
	// creating input object for taking input 
        Scanner input = new Scanner(System.in);

        // Input base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate area in square inches and square centimeters
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 square inch = 6.4516 square cm

        // Print the results
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");
    }
}
