import java.util.*;
public class HeightDemo {
    public static void main(String[] args) {
        List<Integer> keys = new ArrayList<>();
        for (int i = 1; i <= 31; i++) keys.add(i);
        BST<Integer> sorted = new BST<>(), random = new BST<>();
        for (int k : keys) sorted.insert(k);
        Collections.shuffle(keys, new Random(182));
        for (int k : keys) random.insert(k);
        System.out.println("sorted height: " + sorted.height());
        System.out.println("shuffled height: " + random.height());
        System.out.println("empty height: " + new BST<Integer>().height());
        System.out.println("31-node minimum height: 4");
        System.out.println("2011 nodes: 11 to 2011 levels");
    }
}
