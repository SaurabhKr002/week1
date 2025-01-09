import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes using the formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents 
                           + " students is: " + maxHandshakes);
    }
}