package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class alternateSignSum {
    public static int alternateSum(int num){
        if(num==0){
            return 0;
        }
        else if(num%2==0){
            return alternateSum(num-1)-num;

        }
        else{
            return alternateSum(num-1)+num;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int result=alternateSum(n);
        System.out.println("The sum of alternate sign numbers is: "+result);
    }
}
