package Recursion;

public class swapArr {
    public static  void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void swapArr(int i,int arr[],int n){
        if(i>=n/2){
             return;
        }
        swap(arr,i,n-i-1);
        swapArr(i+1,arr,n);


    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5};
        int n=arr.length;
        swapArr(0,arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
