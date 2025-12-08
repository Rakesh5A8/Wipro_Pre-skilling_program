package Day7;

import java.util.HashMap;
import java.util.Map;

public class HashmapMethods {
    public static void main(String[] args) {
        Map<Integer, String> Map1 = new HashMap<>();
        Map1.put(1,"Apple") ;
        Map1.put(2,"Ball") ;
        Map1.put(3,"Cat") ;
        Map1.put(4,"Dog") ;
        System.out.println(Map1);
        System.out.println(Map1.get(2));
        System.out.println(Map1.size());
        System.out.println(Map1.containsKey(4));
        System.out.println(Map1.containsValue("Apple"));
        Map1.remove(4);
        System.out.println(Map1);


    }
    
}
