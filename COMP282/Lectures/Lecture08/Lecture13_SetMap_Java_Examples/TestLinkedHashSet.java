import java.util.*;
public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Mia"); names.add("Ada"); names.add("Mia");
        System.out.println(names);
        names.remove("Mia"); names.add("Mia");
        System.out.println(names);
    }
}
