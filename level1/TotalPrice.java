// Importing Scanner class from util pkg to take input from user 
import java.util.Scanner;
// Creating a class for calculating total price 
public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity of items: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Print the results
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");
    }
}
