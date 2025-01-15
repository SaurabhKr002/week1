import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        // Read the input string using nextLine() method to include spaces
        String inputString = scanner.nextLine();
        
        // Check if the string is a palindrome using different logics
        boolean isPalindromeLogic1 = isPalindromeLogic1(inputString);
        boolean isPalindromeLogic2 = isPalindromeLogic2(inputString, 0, inputString.length() - 1);
        boolean isPalindromeLogic3 = isPalindromeLogic3(inputString);
        
        // Display the results
        System.out.println("Using Logic 1 (iterative comparison): " + isPalindromeLogic1);
        System.out.println("Using Logic 2 (recursive comparison): " + isPalindromeLogic2);
        System.out.println("Using Logic 3 (character arrays comparison): " + isPalindromeLogic3);
        
        // Close the Scanner object
        scanner.close();
    }

    // Logic 1: Method to compare characters from start and end to determine palindrome
    public static boolean isPalindromeLogic1(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeLogic2(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        return isPalindromeLogic2(str, start + 1, end - 1);
    }

    // Logic 3: Method to compare characters using character arrays
    public static boolean isPalindromeLogic3(String str) {
        // Reverse the string using charAt() method
        String reversedStr = reverseString(str);
        
        // Compare the original and reversed strings
        return str.equals(reversedStr);
    }
    
    // Method to reverse a string using charAt() method
    public static String reverseString(String str) {
        char[] reversedArray = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            reversedArray[i] = str.charAt(str.length() - 1 - i);
        }
        
        return new String(reversedArray);
    }
}
