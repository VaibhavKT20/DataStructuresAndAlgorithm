package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class powerUsingRecursion {
    public static long FindingPower(long a,long b){
        long mid=0,result=0,finalResult=0;
        if(b==1){
            return a;

        }
        else{
            mid=b/2;
            result=FindingPower(a,mid);
            finalResult=result*result;
            if(b%2==0){
                return finalResult;
            }
            else{
                return a*finalResult;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        long a=sc.nextLong();
        long b=sc.nextLong();
        long result=FindingPower(a,b);
        System.out.println("Power of a^b is "+result);

    }
}
