import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Convert to uppercase using built-in method
        String upperCaseStringBuiltIn = inputString.toUpperCase();
        
        // Convert to uppercase using custom method
        String upperCaseStringCustom = convertToUpperCase(inputString);
        
        // Compare the two uppercase strings
        boolean areEqual = compareStrings(upperCaseStringBuiltIn, upperCaseStringCustom);
        
        // Display the uppercase conversion results
        System.out.println("Uppercase using built-in method: " + upperCaseStringBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseStringCustom);
        System.out.println("Are the two uppercase strings equal? " + areEqual);
        
        // Split the text into words
        String[] words = splitTextIntoWords(inputString);
        
        // Get the 2D array of words and their lengths
        String[][] wordsAndLengths = getWordsAndLengths(words);
        
        // Display the words and their lengths in a tabular format
        System.out.println("Word\tLength");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println(wordAndLength[0] + "\t" + Integer.parseInt(wordAndLength[1]));
        }
        
        scanner.close();
    }

    // Method to convert each character to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        
        return result.toString();
    }

    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        java.util.ArrayList<String> wordsList = new java.util.ArrayList<>();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    wordsList.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }
        
        return wordsList.toArray(new String[0]);
    }

    // Method to find the length of a string without using the length() method
    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to get a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        
        return result;
    }
}
