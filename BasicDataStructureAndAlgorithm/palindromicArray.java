package BasicDataStructureAndAlgorithm;

public class palindromicArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
               flag=1;
            }

        }
        if(flag==0){
            System.out.println("palindromic array");
        }
        else{
            System.out.println("Not a Palindromic array");
        }
    }
}
