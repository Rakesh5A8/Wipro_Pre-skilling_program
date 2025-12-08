package Day10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine().toLowerCase(); // Normalize to lower case
        scanner.close();

        // LinkedHashMap stores characters and their counts, preserving order of insertion
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // 1. Populate the LinkedHashMap with character counts
        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The first non-repeating character is: '" + entry.getKey() + "'");
                return; // Found the first, so exit the method
            }
        }

        System.out.println("No non-repeating character found in the string.");
    }
}