import java.util.*;
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> scores = new LinkedHashMap<>();
        System.out.println(scores.put("Mia",88));
        System.out.println(scores.put("Ada",91));
        System.out.println(scores.put("Mia",93));
        System.out.println(scores);
        System.out.println("sorted: " + new TreeMap<>(scores));
        for (Map.Entry<String,Integer> entry : scores.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
