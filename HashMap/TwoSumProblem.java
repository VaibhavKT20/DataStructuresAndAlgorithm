package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the element of an array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
            else{
                int b=result[0]=-1;
                int c=result[1]=-1;
                System.out.println(b +" "+ c);
            }
        }
        System.out.println("Two sum index value is: "+result[0]+" "+result[1]);
    }
}
