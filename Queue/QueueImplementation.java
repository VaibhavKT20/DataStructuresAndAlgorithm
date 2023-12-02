package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        //Adding data in the queue
        for(int i=0;i<10;i++){
            q.add(i);
        }
        System.out.println("Queue data looks like: "+q);
        //Remove data from the queue
        q.remove();
        //Printing the top element in the queue or front element in the queue
        System.out.println("Peek element of the queue is "+q.peek());
        //check the size of the queue
        System.out.println("Size of the queue is "+q.size());
    }
}
