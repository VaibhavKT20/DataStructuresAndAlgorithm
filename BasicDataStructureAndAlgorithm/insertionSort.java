package BasicDataStructureAndAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
