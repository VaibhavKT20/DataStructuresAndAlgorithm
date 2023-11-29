package HashMap;
import java.util.*;
public class HashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        //Functionality of the put() function
        hashMap.put(1,"Vaibhav");
        hashMap.put(3,"Sahil");
        hashMap.put(4,"Aastha");
        hashMap.put(5,"john");
        hashMap.put(8,"Doe");
        System.out.println("HashMap of the given Data: "+hashMap);

        //Functionality of the get() function
        String result=hashMap.get(5);
        System.out.println("The value of key is "+result);

        //Functionality of the containsKey() function
        System.out.println(hashMap.containsKey(3));

        //Functionality of the remove() function
        System.out.println(hashMap.remove(5));
        System.out.println("Updated hashMap"+hashMap);

        //Iterating the hashMap

        for(Map.Entry<Integer,String>e: hashMap.entrySet()){
            System.out.println("HashMap is :"+e.getKey()+" : "+e.getValue());
        }
    }
}
