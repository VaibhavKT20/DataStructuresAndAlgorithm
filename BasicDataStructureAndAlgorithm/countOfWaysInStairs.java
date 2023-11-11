package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class countOfWaysInStairs {
    public static int stairsCount(int n){
        int result=0;
        if(n<=1){
            return n;

        }
        else{
            result=stairsCount(n-1)+stairsCount(n-2);

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n=sc.nextInt();
        int result=stairsCount(n+1);
        System.out.println("Number of ways is: "+result);
    }
}
