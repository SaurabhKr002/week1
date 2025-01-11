import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {
		
		//Scanner created
        Scanner input = new Scanner(System.in);

        // Input age and height of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();

        // Input age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();

        // Input age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        // Checking for the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Checking for the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Printing results
        System.out.println("The youngest friend is: " + youngestFriend + " and Age is: " + youngestAge + " cm ");
        System.out.println("Largest of the 3 heights is: " + tallestFriend + " and Height is: " + tallestHeight + "cm");
		
		//Scanner closed
        input.close();
    }
}
