import java.util.Arrays;
import java.util.Random;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers given the size
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generate 4-digit random numbers
        }
        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of five 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, min, and max values of the array
        double[] results = findAverageMinMax(randomNumbers);

        // Display the random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Display the average, minimum, and maximum values
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
