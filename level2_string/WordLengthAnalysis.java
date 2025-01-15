import java.util.Scanner;

public class WordLengthAnalysis {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text: ");
        // Read the input text using nextLine() method
        String inputText = scanner.nextLine();
        
        // Split the text into words using the user-defined method
        String[] words = splitTextUsingMethod(inputText);
        
        // Get the words and their lengths in a 2D array
        String[][] wordsAndLengths = getWordsAndLengths(words);
        
        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongestWords(wordsAndLengths);
        
        // Display the result
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
        
        // Close the Scanner object
        scanner.close();
    }

    // Method to split the text into words without using the split() method
    public static String[] splitTextUsingMethod(String str) {
        int length = findLengthWithoutLengthMethod(str);
        
        // Count the number of words and store the indexes of spaces
        int wordCount = 1;
        int[] spaceIndexes = new int[length];
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[wordCount - 1] = i;
                wordCount++;
            }
        }
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;
        
        // Use the indexes to extract words
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i == wordCount - 1) ? length : spaceIndexes[i];
            words[i] = str.substring(startIndex, endIndex);
            startIndex = endIndex + 1;
        }
        
        return words;
    }

    // Method to find the length of the string without using the length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                // Increment count for each character in the string
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string, so return the count
            return count;
        }
    }

    // Method to get the words and their lengths in a 2D array
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordsAndLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsAndLengths[i][0] = words[i];
            wordsAndLengths[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i]));
        }
        return wordsAndLengths;
    }

    // Method to find the shortest and longest words in a 2D array
    public static String[] findShortestAndLongestWords(String[][] wordsAndLengths) {
        String shortestWord = wordsAndLengths[0][0];
        String longestWord = wordsAndLengths[0][0];
        
        for (String[] wordAndLength : wordsAndLengths) {
            String word = wordAndLength[0];
            int length = Integer.parseInt(wordAndLength[1]);
            
            if (length < findLengthWithoutLengthMethod(shortestWord)) {
                shortestWord = word;
            }
            if (length > findLengthWithoutLengthMethod(longestWord)) {
                longestWord = word;
            }
        }
        
        return new String[] { shortestWord, longestWord };
    }
}
