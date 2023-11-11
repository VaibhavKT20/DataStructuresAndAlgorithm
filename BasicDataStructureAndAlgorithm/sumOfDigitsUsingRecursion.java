package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class sumOfDigitsUsingRecursion {
    public static int digitSum(int num){
        if(num==0){
            return 0;
        }
        else{
         return num%10+digitSum(num/10);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int result=digitSum(num);
        System.out.println("Sum of "+num+" is: "+result);
    }
}
