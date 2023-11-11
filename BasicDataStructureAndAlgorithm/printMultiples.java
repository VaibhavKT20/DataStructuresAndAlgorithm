package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class printMultiples {
    public static void printMultiples(int num,int times){
        if(times==1){
            System.out.println(num);
            return;
        }
        else{
            printMultiples(num,times-1);
            System.out.println(num*times);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,times;
        System.out.println("Enter the number and how many times you want to print: ");
        num=sc.nextInt();
        times= sc.nextInt();
        printMultiples(num,times);



    }
}
