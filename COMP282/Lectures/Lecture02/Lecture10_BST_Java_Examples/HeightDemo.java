import java.util.*;
public class HeightDemo {
    public static void main(String[] args) {
        List<Integer> keys = new ArrayList<>();
        for (int i = 1; i <= 31; i++) keys.add(i);
        BinarySearchTree<Integer> sorted = new BinarySearchTree<>(), random = new BinarySearchTree<>();
        for (int k : keys) sorted.insert(k);
        Collections.shuffle(keys, new Random(182));
        for (int k : keys) random.insert(k);
        System.out.println("sorted levels: " + sorted.height());
        System.out.println("shuffled levels: " + random.height());
        System.out.println("empty levels: " + new BinarySearchTree<Integer>().height());
        System.out.println("31-node minimum levels: 5");
        System.out.println("2011 nodes: 11 to 2011 levels");
    }
}
