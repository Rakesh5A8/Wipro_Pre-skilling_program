package Day7;
import java.util.*;

public class checkCommon {
    public static void main(String[] args) {
        List<Integer> ls1 = Arrays.asList(1, 2, 3);
        List<Integer> ls2 = Arrays.asList(4, 5, 6);
        Set<Integer> set = new HashSet<>(ls1);
        boolean notCommon = true;
        for (int i : ls2) {
            if (set.contains(i)) {
                notCommon = false;
                break;
            }
        }
        System.out.println(notCommon);
    }
}
    
