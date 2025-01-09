// Creating a class for calculating Discounted Fees 
public class DiscountedFee {
    public static void main(String[] args) {
        // Fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount and final fee
        double discount = (discountPercent / 100.0) * fee;
        double finalFee = fee - discount;

        // Print the results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
