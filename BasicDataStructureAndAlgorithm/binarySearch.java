package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int arr[],int target){
        int low=0; int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element in the matrix");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of matrix");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int x=sc.nextInt();
       int result = binarySearch(arr,x);
       if(result==-1){
           System.out.println("Element not found");
       }
       else{
           System.out.println("Element found at index "+result);
       }
    }
}
