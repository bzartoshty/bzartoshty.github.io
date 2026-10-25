import java.util.*;
public class TestTreeSet {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(List.of("Mia","Ada","Zoe","Ada"));
        System.out.println(names);
        System.out.println("ceiling Bea: " + names.ceiling("Bea"));
        System.out.println("below Mia: " + names.headSet("Mia",false));
        Set<String> insensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        System.out.println(insensitive.add("Ada"));
        System.out.println(insensitive.add("ADA"));
    }
}
