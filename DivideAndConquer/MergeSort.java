package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int []arr,int i,int j){
        if(i<j){
            int mid=i+(j-i)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            mergeProcedure(arr,i,mid,j);
        }
    }
    public static void mergeProcedure(int arr[],int l,int mid,int r){
        int i,j,k;
        int n1=mid-l+1;
        int n2=r-mid;
        int []lSubArr=new int[n1];
        int []rSubArr=new int[n2];
        for(i=0;i<n1;i++){
            lSubArr[i]=arr[l+i];

        }
        for(j=0;j<n2;j++){
            rSubArr[j]=arr[mid+1+j];

        }
        i=0;
        j=0;
        k=l;
        while(i<n1&&j<n2){
            if(lSubArr[i]<=rSubArr[j]){
                arr[k]=lSubArr[i];
                i=i+1;
            }
            else{
                arr[k]=rSubArr[j];
                j=j+1;
            }
            k=k+1;

        }
        while(i<n1){
            arr[k]=lSubArr[i];
            i=i+1;
            k=k+1;

        }
        while(j<n2){
            arr[k]=rSubArr[j];
            j=j+1;
            k=k+1;
        }

    }
    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={50,20,40,90,88,11,13};
        int n=arr.length;
        System.out.println("Before sorting:");
        printArr(arr,n);
        mergeSort(arr,0,n-1);
        System.out.println("\nAfter sorting:");
        printArr(arr,n);

    }
}
