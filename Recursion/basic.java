package Recursion;

public class basic {
    public static void print(){
        System.out.println(1);

        print();
    }
    public static void main(String[] args) {
        print();
    }
}
