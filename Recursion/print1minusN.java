package Recursion;

public class print1minusN {
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);

    }
    public static void printrevrse(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        printrevrse(i-1,n);

    }

    public static void main(String[] args) {
        int n=5;
//        print(1,n);
        //reverse 5 4 3 2 1
        printrevrse(n,n);
    }
}
