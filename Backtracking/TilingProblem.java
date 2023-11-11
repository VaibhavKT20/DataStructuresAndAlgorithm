package Backtracking;

import java.util.Scanner;

public class TilingProblem {
    public static int getWays(int n){
        if(n<=3){
            return n;
        }
        else{
            return getWays(n-1)+getWays(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println("For n="+n+" Ways-->> "+getWays(n));

    }
}
