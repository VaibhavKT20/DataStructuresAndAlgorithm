package DivideAndConquer;

public class QuickSort {
    public static void quickSort(int arr[],int l,int h){
            if(l<h){
                int m=partition(arr,l,h);
                quickSort(arr,l,m-1);
                quickSort(arr,m+1,h);
            }
    }
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int arr[],int l,int h){
        int i=l;
        int pivot=arr[l];
        for(int j=i+1;j<=h;j++){
            if(arr[j]<=pivot){
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={50,60,10,30,70,40};
        int n=arr.length;
        printArr(arr,n);
        quickSort(arr,0,n-1);
        System.out.println("\nAfter sorting array is: ");
        printArr(arr,n);

    }

}

