package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the target element to be found: ");
        int target=sc.nextInt();
        int result=LowerBound(arr,target);
        if(result==-1){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }
    public static int LowerBound(int arr[],int target){
        int low=0; int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}
