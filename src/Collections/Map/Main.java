package Collections.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(1,"Jhon");
        hashMap.put(2,"Nick");
        hashMap.put(3,"Roy");

        System.out.println(hashMap);


        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(45));

        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsValue("Jhon"));
    }
}
