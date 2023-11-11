package BasicDataStructureAndAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int arr[]={80,12,43,15,245,2,1,54};
       bubbleSort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int arr[]){
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
               }
            }
            if(!swapped){
                break;
            }
        }

    }
}
