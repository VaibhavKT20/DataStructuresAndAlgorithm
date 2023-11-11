package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class printSequenceOfArray {
    public static  void printSequence(int []arr, int index, ArrayList<Integer>tempArr){
        //base Condition
        if(index==arr.length){
            if(tempArr.size()>0){
                System.out.println(tempArr);
            }
        }
        else{
            //include
            printSequence(arr,index+1,tempArr);
            tempArr.add(arr[index]);
            //Don't Include
            printSequence(arr, index+1, tempArr);
            tempArr.remove(tempArr.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n= sc.nextInt();
        System.out.println("Enter the Array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
//        int arr[]={1,2};
        System.out.println("Array Entered is: "+Arrays.toString(arr));
        printSequence(arr,0,new ArrayList<>());
    }

}
