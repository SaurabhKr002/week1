import java.util.Scanner;

// Class to copy a 2D array into a 1D array
public class MatrixToArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array (matrix) and the 1D array
        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        // Take input for 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 1D array
        System.out.println("1D array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Close the Scanner object
        scanner.close();
    }
}
