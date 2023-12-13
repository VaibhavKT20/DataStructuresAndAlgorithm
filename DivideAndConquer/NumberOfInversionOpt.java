package DivideAndConquer;

import java.util.Arrays;

public class NumberOfInversionOpt {
    public static int mergeProcedure(int arr[],int l,int mid,int h){
        int swap=0;
        int lSubArray[]= Arrays.copyOfRange(arr,l,mid+1);
        int rSubArray[]=Arrays.copyOfRange(arr,mid+1,h+1);
        int i=0;
        int j=0;
        int k=l;
        while(i<lSubArray.length && j<rSubArray.length){
            if(lSubArray[i]<=rSubArray[j]){
                arr[k++]=lSubArray[i++];
            }
            else{
                arr[k++]=rSubArray[j++];
                swap+=(mid+1)-(l+i);
            }
        }
        while (i<lSubArray.length){
            arr[k++]=lSubArray[i++];
        }
        while (j<rSubArray.length){
            arr[k++]=rSubArray[j++];
        }
        return swap;
    }
    public static int inversionCountOpt(int[] arr, int l, int h){
        int count=0;
        if(l<h){
            int mid=l+(h-l)/2;
            count+=inversionCountOpt(arr,l,mid);
            count+=inversionCountOpt(arr,mid+1,h);
            count+=mergeProcedure(arr,l,mid,h);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,8,3,4};
        int n = arr.length;
        int countOpt = inversionCountOpt(arr, 0, n-1);
        System.out.println("The inversion count of a given array using divide and conquer approach is: "+countOpt);
    }
}
