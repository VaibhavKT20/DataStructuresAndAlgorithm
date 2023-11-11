package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class binarySearchUsingRecursion {
    public static int binarySearchUsingRecursion(int arr[],int low,int high,int target){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target) {
                return binarySearchUsingRecursion(arr,mid+1,high,target);
            }
            else{
                return binarySearchUsingRecursion(arr,low,mid-1,target);
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result;
        int arr[]={10,21,42,55,66,76,98};
        System.out.println("Enter the target element you want to search: ");
        int target= sc.nextInt();
        result=binarySearchUsingRecursion(arr,0,arr.length,target);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }

    }
}
