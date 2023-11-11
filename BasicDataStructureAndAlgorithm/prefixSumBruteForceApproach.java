package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class prefixSumBruteForceApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();


        System.out.println("Enter the 2D array: ");
        int arr[][]=new int[m][n];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the r1 coordinate: ");
        int r1=sc.nextInt();
        System.out.println("Enter the r2 coordinate: ");
        int r2=sc.nextInt();
        System.out.println("Enter the c1 coordinate: ");
        int c1=sc.nextInt();
        System.out.println("Enter the c2 coordinate: ");
        int c2=sc.nextInt();

        int result=ArrayPrefixSum(arr,r1,r2,c1,c2);
        System.out.println("Sum of the Given prefixes is :"+result);
    }


    public static int ArrayPrefixSum(int[][] arr,int r1,int r2,int c1,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+arr[i][j];
            }
        }
        return sum;
    }
}
