import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Scanner created
        Scanner input = new Scanner(System.in);
        
        // Get the input value
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Factors of the entered number " + number + " are:");
        
        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        //Scanner ClosedByInterruptException
        input.close();
    }
}
