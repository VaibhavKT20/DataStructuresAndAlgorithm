package Queue;
//Implementation of queue using stack
//Time complexity of enqueue =O(1)
//Time complexity of dequeue=O(n)
//Space complexity of Operation =O(n)
import java.util.*;
public class QueueusingStack {
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();
    static  void enQueue(int data){
        //time complexity=O(1)
        stack1.push(data);
    }
    static int deQueue(){
        int ele;
        if(stack1.empty()&&stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        //push all the element from stack1 to stack2
        if(stack2.empty()){
            while(!stack1.empty()){
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        QueueusingStack q=new QueueusingStack();
        //Inserting element in the queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        //Deleting element from the queue

        System.out.println("Element deleted is "+q.deQueue());
        System.out.println("Element deleted is "+q.deQueue());
    }
}
