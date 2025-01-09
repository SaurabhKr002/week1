// Creating a class for calculating Volume of Earth 
public class VolumeOfEarth {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.6;

        // Calculate volume using formula (4/3) * pi * r^3
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}
