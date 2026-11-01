import java.util.*;
public class MapViewsDemo {
    public static void main(String[] args) {
        Map<String,Integer> scores = new LinkedHashMap<>();
        scores.put("Ada",90); scores.put("Mia",90);
        Set<String> keys = scores.keySet();
        Collection<Integer> values = scores.values();
        System.out.println(values);
        keys.remove("Ada");
        System.out.println(scores);
        scores.put("Zoe",100);
        System.out.println(keys);
        Map.Entry<String,Integer> entry = scores.entrySet().iterator().next();
        System.out.println("old: " + entry.setValue(95));
        System.out.println(scores);
    }
}
