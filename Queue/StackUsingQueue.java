package Queue;
//Time Complexity of add:O(n)
//Time Complexity of remove:O(1)
//Space Complexity :O(n)
import java.util.*;

public class StackUsingQueue {
       static Queue<Integer> q1=new LinkedList<>();
       static Queue<Integer> q2=new LinkedList<>();
       //time complexity: O(n)
       static void add(int data){
           while(!q1.isEmpty()){
               q2.add(q1.peek());
               q1.poll();
           }
           //2. push new data to q1
           q1.add(data);
           //3.Move back all the elements from q2 to q1
            while (!q2.isEmpty()){
                q1.add(q2.peek());
                q2.poll();

            }
       }
       //To delete the element from the stack
      //Time complexity: O(1)
       static int remove(){
            if(q1.isEmpty()){
                System.out.println("Queue underflow");
                System.exit(0);
            }
            int ele=q1.peek();
            q1.poll();
            return ele;

       }

    public static void main(String[] args) {
        StackUsingQueue s=new StackUsingQueue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        //Pop element from the stack
        System.out.println("Element deleted is "+s.remove());
        }

}
