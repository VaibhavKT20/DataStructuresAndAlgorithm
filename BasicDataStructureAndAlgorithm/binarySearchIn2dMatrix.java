package BasicDataStructureAndAlgorithm;

import java.util.Scanner;

public class binarySearchIn2dMatrix {
    public static  boolean searchMatricx(int [][]matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
        int midIdx,rowIdx,colIdx,midElem;
        while(low<=high){
             midIdx=low+(high-low)/2;
             rowIdx=midIdx/col;
             colIdx=midIdx%col;
             midElem=matrix[rowIdx][colIdx];
             if(target==midElem){
                 return true;
             }
             else if(target<midElem){
                 high=midIdx-1;
             }
             else{
                 low=midIdx+1;
             }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Enter the target element: ");
        int target=sc.nextInt();
        boolean result=searchMatricx(arr,target);
        System.out.println(result);
    }
}
