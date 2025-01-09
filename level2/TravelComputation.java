import java.util.Scanner;

public class TravelComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for name and cities
        System.out.print("Enter the traveler's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the departure city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        // Take user inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours and minutes, separated by a space): ");
        int hoursFromToVia = scanner.nextInt();
        int minutesFromToVia = scanner.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours and minutes, separated by a space): ");
        int hoursViaToFinalCity = scanner.nextInt();
        int minutesViaToFinalCity = scanner.nextInt();

        // Calculate total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Calculate total time in minutes
        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nTravel Details:");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.printf("Total Distance: %.2f km\n", totalDistance);
        System.out.println("Total Time: " + (totalTime / 60) + " hours and " + (totalTime % 60) + " minutes");

        // Close the scanner
        scanner.close();
    }
}
