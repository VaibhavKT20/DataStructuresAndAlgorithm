package BasicDataStructureAndAlgorithm;

public class reverseAnArray {
    public static void main(String[] args) {
        int array[]={13,21,43,11,23,111};
        int n=array.length;
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;

        }
        System.out.println("Reversed array is :");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" " );
        }
        System.out.println();
    }
}
