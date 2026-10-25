import java.util.*;
public class SetOperations {
    public static <E> Set<E> union(Set<E> x, Set<E> y) {
        Set<E> result = new HashSet<>(x); result.addAll(y); return result;
    }
    public static <E> Set<E> intersection(Set<E> x, Set<E> y) {
        Set<E> result = new HashSet<>(x); result.retainAll(y); return result;
    }
    public static <E> Set<E> difference(Set<E> x, Set<E> y) {
        Set<E> result = new HashSet<>(x); result.removeAll(y); return result;
    }
    public static void main(String[] args) {
        Set<Integer> x = Set.of(54,19,75), y = Set.of(75,12);
        System.out.println("union: " + new TreeSet<>(union(x,y)));
        System.out.println("intersection: " + new TreeSet<>(intersection(x,y)));
        System.out.println("X minus Y: " + new TreeSet<>(difference(x,y)));
        System.out.println("Y minus X: " + new TreeSet<>(difference(y,x)));
        System.out.println("X unchanged: " + new TreeSet<>(x));
    }
}
