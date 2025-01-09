// Importing Scanner class from util pkg for taking input 
import java.util.Scanner;
// Creating class for calculation of total number of rounds the athelete will run 
public class TriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side1 in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        int rounds = (int) (5000 / perimeter);  // 5000 meters = 5 km

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
