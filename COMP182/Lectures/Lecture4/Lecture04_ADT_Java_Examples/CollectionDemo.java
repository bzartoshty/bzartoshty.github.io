import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>(Arrays.asList("Ada", "Lin", "Ada"));
        System.out.println(names.size());
        System.out.println(names.contains("Ada"));
        System.out.println(names.remove("Ada")); // Removes one occurrence.
        System.out.println(names);
        names.addAll(Arrays.asList("Mia", "Lin"));
        names.retainAll(Arrays.asList("Lin", "Mia"));
        System.out.println(names);
        names.removeAll(Arrays.asList("Lin")); // Removes every matching element.
        System.out.println(names);
    }
}
