package BasicDataStructureAndAlgorithm;
import java.util.*;
public class printSequenceRecursion {
    public static void printSequences(int arr[],int index,ArrayList<Integer>tempArr) {
        if (index == arr.length) {
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }


            printSequences(arr, index + 1, tempArr);
            tempArr.add(arr[index]);
            printSequences(arr, index + 1, tempArr);
            tempArr.remove(tempArr.size() - 1);
        }



    public static void main(String[] args) {
        int[]arr={1,2};
        System.out.println("Array sequence of --->"+Arrays.toString(arr)+" are --->");
        printSequences(arr,0,new ArrayList<>());
    }
}
