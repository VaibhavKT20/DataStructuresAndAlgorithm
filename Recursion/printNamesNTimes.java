package Recursion;

public class printNamesNTimes {
    public static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Raj");
        print(i+1,n);
    }
    public static void main(String[] args) {
        int n=5;
        print(1,n);
    }
}
