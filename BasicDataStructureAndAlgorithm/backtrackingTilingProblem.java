package BasicDataStructureAndAlgorithm;

public class backtrackingTilingProblem {
    public static int get_Ways(int n){
        if(n<=3){
            return n;
        }
        else{
            return get_Ways(n-1)+get_Ways(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(get_Ways(1));
        System.out.println(get_Ways(2));
        System.out.println(get_Ways(4));
        System.out.println(get_Ways(5));
        System.out.println(get_Ways(8));
    }
}
