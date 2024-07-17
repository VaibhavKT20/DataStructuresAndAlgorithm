package Recursion;

public class basic1 {
    private static int cnt = 0;

    public static void func(){
        if(cnt==4){
            return;
        }
            System.out.println(cnt);
            cnt++;
            func();

    }
    public static void main(String[] args) {
        func();
    }
}
