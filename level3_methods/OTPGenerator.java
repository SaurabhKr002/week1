import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Array to save the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate OTP numbers 10 times
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Validate the uniqueness of the generated OTPs
        boolean uniqueOTPs = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + (uniqueOTPs ? "Yes" : "No"));
    }
}
