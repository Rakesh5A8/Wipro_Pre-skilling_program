package Day7;

import java.util.HashMap;

public class CountcharMap {
    public static void main(String[] args) {
        String s = "programming";
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> Map1= new HashMap<>();
        for(Character i: ch){
            Map1.put(i, Map1.getOrDefault(i,0)+1);
        }
        System.out.println(Map1);
        for(char i:Map1.keySet()){
            if(Map1.get(i) > 1) {
                System.out.println(i + " = " + Map1.get(i));
            }
        }
    }
    
}
