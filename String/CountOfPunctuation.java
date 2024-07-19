package String;

import java.util.Scanner;

public class CountOfPunctuation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str= sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
            {
                count++;
            }
        }
        System.out.print("The count of punctuation is "+count);
    }
}
