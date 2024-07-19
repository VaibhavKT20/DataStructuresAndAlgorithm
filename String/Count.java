package String;

public class Count {
    public static void main(String[] args) {
        String str = "My name is Vaibhav Kumar";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.print("The count of the String is "+count);
    }
}
