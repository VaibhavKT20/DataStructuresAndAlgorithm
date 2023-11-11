package BasicDataStructureAndAlgorithm;

public class missing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
       int n=arr.length;
       int sumOfNaturalNumber=((n+1)*(n+2))/2;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       int missingElem=0;
       missingElem=sumOfNaturalNumber-sum;
        System.out.println("Missing element is "+missingElem);
    }
}
