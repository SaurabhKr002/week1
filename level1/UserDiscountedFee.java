//Importing Scanner class for user input 
import java.util.Scanner;
// Creating a class for calculating discounted fee, provided that the student fee will be taken as input 
public class UserDiscountedFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the fee amount (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
