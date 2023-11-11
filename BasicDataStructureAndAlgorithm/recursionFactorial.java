package BasicDataStructureAndAlgorithm;
import java.util.*;

public class recursionFactorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else{
            return n*factorial(n-1);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want to find the factorial: ");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("The factorial of "+n+" is: "+result);
    }

}

