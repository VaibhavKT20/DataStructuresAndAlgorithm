package String;

public class Builder {
    public static void main(String[] args) {
//        StringBuilder s=new StringBuilder("hello");
//        s.append("World");
//        System.out.println(s);
//        s.setCharAt(0,'m');
//        System.out.println(s);
//        s.append("true");
//        System.out.println(s);
//        s.insert(2,'y');
//        System.out.println(s);
//        s.deleteCharAt(5);
//        System.out.println(s);
        StringBuilder str=new StringBuilder("physics");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
//        str.delete(2,4);
//        System.out.println(str);
        System.out.println(str.substring(3));
    }
}
