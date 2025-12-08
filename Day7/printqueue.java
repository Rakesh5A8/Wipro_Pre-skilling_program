package Day7;

import java.util.*;
public class printqueue {
    public static void main(String[] args) {
        // Create a Queue of Integers
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(35);
        queue.remove(10);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Entire queue " + queue);
    }
}