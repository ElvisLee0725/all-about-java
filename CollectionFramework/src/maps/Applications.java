package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Applications {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Brave", "Be bold");
        map.put("Courage", "Do not fear");
        map.put("Love", "Love one another");
        map.put("Joy", "Be happy");
        for(String name : map.keySet()) {
            System.out.println(name);
        }

        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Brave", "Be bold");
        linkedMap.put("Courage", "Do not fear");
        linkedMap.put("Love", "Love one another");
        linkedMap.put("Joy", "Be happy");
        for(String content : linkedMap.values()) {
            System.out.println(content);
        }

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Brave", "Be bold");
        treeMap.put("Courage", "Do not fear");
        treeMap.put("Love", "Love one another");
        treeMap.put("Joy", "Be happy");
        for(Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
