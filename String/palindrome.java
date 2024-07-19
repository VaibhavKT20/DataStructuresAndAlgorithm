package String;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abccba";
        StringBuilder gtr=new StringBuilder(str);
        gtr.reverse();
        String s =gtr+"";
        if(str.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


    }
}
