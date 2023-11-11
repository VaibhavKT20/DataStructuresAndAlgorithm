package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class SquareRoot {
    public static int SquareRoot(int n){
        int low=0,high=n,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
           long val=mid*mid;
           if(val==n){
               return mid;
           }
           else if(val<n){
               result=mid;
               low=mid+1;
           }
           else{
               high=mid-1;
           }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to find the square root");
        int n=sc.nextInt();
        int result=SquareRoot(n);
        System.out.println("Square root of "+n+ " is "+result);

    }
}
