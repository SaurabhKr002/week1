import java.util.*;

public class CollinearPointsChecker {

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check and display if the points are collinear using the slope formula
        boolean collinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the slope formula? " + (collinearUsingSlope ? "Yes" : "No"));

        // Check and display if the points are collinear using the area formula
        boolean collinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the area formula? " + (collinearUsingArea ? "Yes" : "No"));

        scanner.close();
    }
}
