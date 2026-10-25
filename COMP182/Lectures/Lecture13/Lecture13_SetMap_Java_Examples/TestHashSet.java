import java.util.*;
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Mia"));
        System.out.println(names.add("Ada"));
        System.out.println(names.add("Mia"));
        System.out.println("size: " + names.size());
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().startsWith("M")) it.remove();
        }
        System.out.println("remaining: " + names);
    }
}
