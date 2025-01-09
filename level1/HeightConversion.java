// importing Scanner class from util package to take input from user 
import java.util.Scanner;

// creating class for converting height from cm to inches 
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert to feet and inches
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Print the results
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + " and inches is " + inches);
    }
}
