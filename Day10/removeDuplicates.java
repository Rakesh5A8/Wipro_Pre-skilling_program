package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(5, 1, 3, 5, 2, 1, 4, 3, 5));
        System.out.println("Original List: " + listWithDuplicates);

        Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);

        List<Integer> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("List without duplicates (order preserved): " + listWithoutDuplicates);
    }
}