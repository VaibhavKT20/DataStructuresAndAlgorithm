package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(5);
        deque.addLast(7);
        deque.addLast(9);
        System.out.println("Deque Looks Like "+deque);
//        deque.removeLast();
//        System.out.println("Deque after deletion "+deque);
          deque.removeFirst();
          System.out.println("Deque after deletion "+deque);
    }

}
