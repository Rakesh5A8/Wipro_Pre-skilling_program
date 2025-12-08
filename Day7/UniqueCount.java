package Day7;

import java.util.*;
public class UniqueCount {
    public static void main(String[] args) {
        String S = "Java is fun and Java is powerfull";
        String[] words = S.split(" ");
       
        Set<String> uniquewords= new HashSet<>(Arrays.asList(words));
        System.out.println("unique words count: " + uniquewords.size());
        System.out.println("unique words: " + uniquewords);
    }
    
}
