/** Complete the two TODOs, then run: java ListLab */
public class ListLab {
    static <E> int countOccurrences(MyList<E> list, E target) {
        // TODO: use iteration and java.util.Objects.equals.
        throw new UnsupportedOperationException("Complete countOccurrences");
    }
    static <E> void removeAllMatches(MyList<E> list, E target) {
        // TODO: use an iterator's remove(), or scan indices backward.
        throw new UnsupportedOperationException("Complete removeAllMatches");
    }
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>(new String[]{"A", "A", null, "B", "A"});
        System.out.println(countOccurrences(list, "A")); // Expected: 3
        removeAllMatches(list, "A");
        System.out.println(list); // Expected: [null, B]
    }
}
