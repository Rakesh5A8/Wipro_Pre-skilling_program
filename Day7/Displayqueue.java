package Day7;

import java.util.LinkedList;
import java.util.Queue;

public class Displayqueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(25);
        queue.add(30);
        queue.add(45);
        for (int i : queue) {
            System.out.print(i+ " ");
        }
    }
    
}
