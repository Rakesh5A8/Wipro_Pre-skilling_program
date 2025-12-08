// package Day7;
// import java.util.*;

// public class listMethods {
//     public static void main(String[] args) {
//         List<Integer> ls = new ArrayList<>();
//         ls.add(10);
//         ls.add(20);
//         ls.add(30);
//         ls.add(40);
//         ls.add(50)
//         System.out.println(ls);
//         ls.remove(1);
//         System.out.println(ls.get(1)); 
//         System.out.println(ls.size());
//         ls.set(0,0 );
//         System.out.println(ls);
//         ls.contains(20);
//     }
    
// }

package Day7;

import java.util.*;
public class listMethods {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 30, 20, 20, 10, 30, 20, 40);
        List<Integer> res = new ArrayList<>();
        for (Integer i : ls) {
            if (!res.contains(i)) res.add(i);
        }
        System.out.println("The result after removing duplicates:" + res);
        Collections.sort(res);
        System.out.println("After sorting: " +res);
    }
}
        
