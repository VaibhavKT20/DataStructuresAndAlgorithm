package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Validparenthesis {
    public static boolean isValid(String str){
        char[] chars=str.toCharArray();
        Stack<Character>stack1=new Stack<>();
        for (char ele : chars) {
            if (ele == '(' || ele == '{' || ele == '[') {
                stack1.push(ele);
                continue;
            }
            else if (stack1.empty()) {
                return false;
            }
            char top = stack1.pop();
            if(top=='('&&ele!=')'){
                return false;
            }
            else if(top=='{'&&ele!='}'){
                return false;
            }
            else if(top=='['&&ele!=']'){
                return false;
            }
            
        }
        return  stack1.empty()==true;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str=sc.nextLine();
        System.out.println("Is the given string is valid? "+isValid(str));
    }
}
