import java.lang.reflect.*;
public class LegacyHeightConventionTest {
    public static void main(String[] args) throws Exception {
        for (Class<?> type : new Class<?>[]{BST.class, BinarySearchTree.class, BinarySerachTree.class}) {
            Method insert = type.getMethod("insert", Comparable.class);
            Method recursive = type.getMethod("height"), queue = type.getMethod("getHeight");
            Object chain = type.getConstructor().newInstance();
            check(recursive, queue, chain, 0);
            for (int key = 1; key <= 7; key++) {
                insert.invoke(chain, key); check(recursive, queue, chain, key);
            }
            Object perfect = type.getConstructor().newInstance();
            for (int key : new int[]{4,2,6,1,3,5,7}) insert.invoke(perfect,key);
            check(recursive, queue, perfect, 3);
            System.out.println(type.getSimpleName()+": empty 0, leaf 1, chain 7, perfect 3 passed");
        }
    }
    private static void check(Method a, Method b, Object tree, int expected) throws Exception {
        if ((int)a.invoke(tree) != expected || (int)b.invoke(tree) != expected)
            throw new AssertionError("height expected "+expected);
    }
}
