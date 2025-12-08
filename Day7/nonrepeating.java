package Day7;
import java.util.*;

public class nonrepeating {
    public static void main(String[] args) {
        String str = "swiss";
        Set<Character> seen = new HashSet<>();
        Set<Character> repeating = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) { 
                repeating.add(c);
            }
        }

        for (char c : str.toCharArray()) {
            if (!repeating.contains(c)) {
                System.out.println("Output: " + c);
                break;
            }

        }

    }
}