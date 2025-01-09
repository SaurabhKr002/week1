// Creating a class for calculating Profit and loss 
public class ProfitLoss {
    public static void main(String[] args) {
        // Define the cost price and selling price
        int costPrice = 129, sellingPrice = 191;

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Print the results in a single statement
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
