/**
 * COMP 182 - Hashing
 * Slides 5, 6, 41
 * JDK HashMap permits null values; containsKey distinguishes a null mapping from absence.
 */
import java.util.HashMap;
public class JavaHashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        System.out.println("first put: " + map.put("apple", "fruit"));
        System.out.println("replacement: " + map.put("apple", "a fruit"));
        map.put("pear", null);
        System.out.println("pear value: " + map.get("pear"));
        System.out.println("pear present: " + map.containsKey("pear"));
        System.out.println("absent value: " + map.get("orange"));
        System.out.println("orange present: " + map.containsKey("orange"));
        System.out.println("removed: " + map.remove("apple"));
        System.out.println("size: " + map.size());
        // HashMap iteration order is not a sorted-order contract.
    }
}
