package BasicDataStructureAndAlgorithm;

import java.math.*;

import java.util.Scanner;

public class powerFIndingBigInt {
    public static BigInteger findPower(BigInteger a,int b){
        BigInteger result,finalResult;

         if(b==1) {
            return a;
        }
        else{
            result = findPower(a, b / 2);
            finalResult = result.multiply(result);
            if(b%2==0) {
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=findPower(a,b);
        System.out.println("The value of a^b is: "+result);
    }
}
