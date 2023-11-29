package Stack;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        System.out.println("Peek Element in the stack before deletion is "+stack1.peek());
        stack1.pop();;
        System.out.println("Peek Element in the stack after deletion is "+stack1.peek());

        //Whenever search operation is called it starts from the top element and it starts from 1 not 0
        //Search function return always -1 when element is not present in the stack
        System.out.println("Element 4 is found at position "+stack1.search(4));

        // Check whether stack is empty or not
        // empty() function returns only true/false
        System.out.print("Is stack is empty or not");
        System.out.println(": "+stack1.empty());


    }
}
