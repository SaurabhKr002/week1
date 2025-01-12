import java.util.*;

public class EmployeeBonus {

    // Method to generate random salaries and years of service
    public static double[][] generateSalaryAndService(int numEmployees) {
        double[][] data = new double[numEmployees][2];
        Random random = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Generate 5-digit salary
            data[i][1] = random.nextInt(10) + 1; // Generate years of service between 1 and 10
        }

        return data;
    }

    // Method to calculate the new salary and bonus based on the logic
    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate and display the sums of old salary, new salary, and total bonus
    public static void displaySummary(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee | Old Salary | Years of Service | New Salary | Bonus");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            sumOldSalary += oldData[i][0];
            sumNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("  %2d     | %9.2f |       %2d         | %10.2f | %5.2f\n",
                    (i + 1), oldData[i][0], (int) oldData[i][1], newData[i][0], newData[i][1]);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total    | %9.2f |                   | %10.2f | %5.2f\n",
                sumOldSalary, sumNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate salary and years of service
        double[][] salaryAndService = generateSalaryAndService(numEmployees);

        // Calculate new salary and bonus
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService);

        // Display summary
        displaySummary(salaryAndService, newSalaryAndBonus);
    }
}
