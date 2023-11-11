package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx=-1;
        System.out.println("Enter the element to be searched: ");
        int x=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx=i;
            }
        }
        if(idx==-1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Element found at index "+idx);
        }






    }
}
