package com.collections;
import java.util.HashMap;
import java.util.Map;

public class MergeHashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("a", 2);
        map1.put("b", 3);

        HashMap<String, Integer> map2 = new HashMap<>();

        map2.put("b", 4);
        map2.put("c", 5);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            int value = entry.getValue();

            map1.put(key, map1.getOrDefault(key, 0) + value);
        }

        System.out.println("Merged HashMap: " + map1);
    }
}