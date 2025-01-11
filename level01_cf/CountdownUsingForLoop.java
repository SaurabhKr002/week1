import java.util.Scanner;

class CountdownUsingForLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the countdown start value
        System.out.print("Enter the starting value for countdown - ");
        int counter = input.nextInt();

        // Perform the countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
		
		//closing input
        input.close();
    }
}
