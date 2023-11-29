package HashMap;

import java.util.*;

public class typeOfHashmap {
    public static void main(String[] args) {
        //Unorder return type
        HashMap<Integer,String>map=new HashMap<>();
        map.put(2,"Vaibhav");
        map.put(6,"abc");
        map.put(3,"efg");
        map.put(1,"hij");
        System.out.println("Hashmap looks like "+map);

        //LinkedHashmap is used for the ordered return type
        LinkedHashMap<Integer,String>map1=new LinkedHashMap<>();
        map1.put(2,"Vaibhav");
        map1.put(6,"abc");
        map1.put(3,"efg");
        map1.put(1,"hij");
        System.out.println("LinekdHashmap looks like "+map1);

        //Treemap datatype
        TreeMap<Integer,String>map2=new TreeMap<>();
        map2.put(2,"Vaibhav");
        map2.put(6,"abc");
        map2.put(3,"efg");
        map2.put(1,"hij");
        System.out.println("Treemap looks like "+map2);
    }
}
