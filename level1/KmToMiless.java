// importing scanner class from util package for taking input 
import java.util.Scanner;
//Creating a class to convert kilometers to miles 
public class KmToMiless {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert kilometers to miles
        double miles = km / 1.6;

        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
