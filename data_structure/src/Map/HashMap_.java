package Map;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        System.out.println(myMap.toString());

        myMap.put("Korean", 90);
        myMap.put("Math", 130);
        myMap.put("English", 30);
        myMap.put("Science", 40);

        System.out.println(myMap.toString());

        myMap.remove("English");
        System.out.println(myMap.toString());

        System.out.println(myMap.get("Korean"));
        System.out.println(myMap.size());
        System.out.println(myMap.containsKey("Math"));

        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

        for(String subject : myMap.keySet()) {
            System.out.println(subject);
        }
    }
}
