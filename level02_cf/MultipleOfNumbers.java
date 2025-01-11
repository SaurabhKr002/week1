import java.util.Scanner;

public class MultipleOfNumbers {
    public static void main(String[] args) {
        
		//Scanner created
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Multiples of the entered numver " + number + " below 100 are:");
        
        // Finding multiples, running backward
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        //Scanner closed
        input.close();
    }
}
