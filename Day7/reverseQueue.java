package Day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class reverseQueue {
    public static void main(String[] args) {
        
        // Input: [1, 2, 3, 4] (Front is 1, Rear is 4)
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue);
        List<Integer> ls = new ArrayList<>(myQueue);
        myQueue.clear();
         for (int i = ls.size()-1; i >= 0; i--) {
            myQueue.add(ls.get(i));
        }
        System.out.println("Queue after reversing: " + myQueue);
    }
}
