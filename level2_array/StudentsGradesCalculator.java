import java.util.Scanner;

// Class to calculate the grades of students based on their marks in three subjects
public class StudentsGradesCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create a 2D array to store marks and arrays to store percentages and grades
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student in Physics, Chemistry, and Maths
        System.out.println("Enter the marks for each student in Physics, Chemistry, and Maths:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();

                // Ensure marks are positive
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Please enter positive marks.");
                    j--; // Decrement index to re-enter the mark
                }
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display results
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " -> Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] +
                               ", Percentage: " + percentages[i] + ", Grade: " + grades[i]);
        }

        // Close the Scanner object
        scanner.close();
    }
}
