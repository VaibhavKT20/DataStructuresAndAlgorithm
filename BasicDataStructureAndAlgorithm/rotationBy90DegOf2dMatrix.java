package BasicDataStructureAndAlgorithm;

import java.util.Arrays;

public class rotationBy90DegOf2dMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{12,23,14,15},{14,12,14,15}};
        int m=arr.length;
        int n=arr[0].length;

        //Transpose of a matrix
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<m;i++){
            int li=0;
            int ri=0;
            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[ri][i];
                arr[ri][i]=temp;
                li++;
                ri--;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
