package Day10;

import java.util.HashMap;
import java.util.*;


public class wordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or paragraph:");
        String inputString = scanner.nextLine();
        scanner.close();

        // 1. Normalize the string: convert to lower case and remove non-word characters
        String cleanString = inputString.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = cleanString.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words)
            map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
        
    }
}