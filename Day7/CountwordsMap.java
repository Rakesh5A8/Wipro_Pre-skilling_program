package Day7;


import java.util.*;

public class CountwordsMap {
    public static void main(String[] args) {
        String S = "What a beautiful day it is with a beautiful weather";
        String[] words = S.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : words)
            map.put(i, map.getOrDefault(i, 0) + 1);
        System.out.println(map);
    }
}

