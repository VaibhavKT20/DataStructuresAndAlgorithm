package DivideAndConquer;
//brute force approach
public class NumberOfInversion {
    public static int numberOfInversion(int arr[],int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,8,3,4};
        int n=arr.length;
        int count=numberOfInversion(arr,n);
        System.out.println("The count of inversion is "+count);
    }
}
