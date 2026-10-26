import java.math.BigDecimal;
public class OrderingEqualityDemo {
    public static void main(String[] args) {
        BinarySearchTree<BigDecimal> tree = new BinarySearchTree<>();
        BigDecimal a = new BigDecimal("1.0"), b = new BigDecimal("1.00");
        System.out.println("equals: " + a.equals(b));
        System.out.println("compareTo: " + a.compareTo(b));
        System.out.println("first insert: " + tree.insert(a));
        System.out.println("second insert: " + tree.insert(b));
        System.out.println("size: " + tree.size());
    }
}
