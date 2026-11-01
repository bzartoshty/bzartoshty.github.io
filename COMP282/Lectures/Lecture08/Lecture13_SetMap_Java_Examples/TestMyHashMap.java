import java.util.*;
public class TestMyHashMap {
    public static void main(String[] args) {
        MyMap<String,Integer> scores = new MyHashMap<>();
        System.out.println(scores.put("Ada",90));
        System.out.println(scores.put("Ada",95));
        scores.put("Mia",95);
        System.out.println("size: " + scores.size());
        System.out.println("get Ada: " + scores.get("Ada"));
        System.out.println("values preserve duplicates: " + scores.values());
        Set<String> keys = scores.keySet(); scores.remove("Ada");
        System.out.println("snapshot retains Ada: " + keys.contains("Ada"));
        System.out.println("current keys: " + scores.keySet());
    }
}
