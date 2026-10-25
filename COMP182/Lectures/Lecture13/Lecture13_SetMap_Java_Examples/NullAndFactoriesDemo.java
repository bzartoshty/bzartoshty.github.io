import java.util.*;
public class NullAndFactoriesDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>(); map.put("Ada",null);
        System.out.println(map.get("Ada"));
        System.out.println(map.get("Zoe"));
        System.out.println(map.containsKey("Ada"));
        System.out.println(map.containsKey("Zoe"));
        try { Set.of("Ada","Ada"); }
        catch (IllegalArgumentException e) { System.out.println("Set.of rejects duplicates"); }
        try { Set.of("Ada").add("Mia"); }
        catch (UnsupportedOperationException e) { System.out.println("Set.of is unmodifiable"); }
        Set<String> set = new HashSet<>(); set.add(null); set.add(null);
        System.out.println("HashSet null count: " + set.size());
    }
}
