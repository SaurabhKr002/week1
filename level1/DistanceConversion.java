//Importing Scanner class from util pkg for taking input from user 
import java.util.Scanner;
// Creating class for calculating Distance in Yards
public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for " + distanceInFeet + " feet.");
    }
}
