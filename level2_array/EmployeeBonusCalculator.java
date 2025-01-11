import java.util.Scanner;

// Class to calculate the bonus of employees based on their years of service
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize arrays to store salaries, years of service, bonus, and new salaries
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // Input salaries and years of service
        System.out.println("Enter the salary and years of service for each of the 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + " - Salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Employee " + (i + 1) + " - Years of Service: ");
            double years = scanner.nextDouble();

            // Validate input
            if (salary < 0 || years < 0) {
                System.out.println("Invalid input. Please enter valid numbers.");
                i--; // Decrement index to retry input for the same employee
                continue;
            }

            // Store valid inputs
            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonuses, new salaries, and total amounts
        for (int i = 0; i < 10; i++) {
            bonuses[i] = (yearsOfService[i] > 5 ? 0.05 : 0.02) * salaries[i];
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner object
        scanner.close();
    }
}
