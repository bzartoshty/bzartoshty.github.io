import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;

/** Run without -ea. Checks throw AssertionError explicitly. */
public class ListChecks {
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
    static void expect(Class<? extends Throwable> type, Runnable action) {
        try { action.run(); } catch (Throwable t) {
            if (type.isInstance(t)) return;
            throw new AssertionError("Wrong exception", t);
        }
        throw new AssertionError("Expected " + type.getName());
    }
    public static void main(String[] args) {
        MyArrayList<Integer> actual = new MyArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        Random rng = new Random(182);
        for (int step = 0; step < 5000; step++) {
            Integer value = rng.nextInt(5) == 0 ? null : rng.nextInt(20);
            int op = expected.isEmpty() ? 0 : rng.nextInt(4);
            if (op == 0) {
                int index = rng.nextInt(expected.size() + 1);
                actual.add(index, value); expected.add(index, value);
            } else if (op == 1) {
                int index = rng.nextInt(expected.size());
                check(Objects.equals(actual.remove(index), expected.remove(index)));
            } else if (op == 2) {
                int index = rng.nextInt(expected.size());
                check(Objects.equals(actual.set(index, value), expected.set(index, value)));
            } else actual.trimToSize();
            check(actual.size() == expected.size());
            check(actual.capacity() >= actual.size());
            for (int i = 0; i < expected.size(); i++)
                check(Objects.equals(actual.get(i), expected.get(i)));
            check(actual.indexOf(value) == expected.indexOf(value));
            check(actual.lastIndexOf(value) == expected.lastIndexOf(value));
        }
        MyArrayList<String> list = new MyArrayList<>();
        list.trimToSize(); list.add("A"); list.add("A"); list.add(null);
        check(list.contains(null));
        expect(IndexOutOfBoundsException.class, () -> list.get(-1));
        expect(IndexOutOfBoundsException.class, () -> list.get(list.size()));
        expect(IndexOutOfBoundsException.class, () -> list.add(list.size() + 1, "X"));
        expect(IndexOutOfBoundsException.class, () -> list.remove(list.size()));
        Iterator<String> it = list.iterator();
        expect(IllegalStateException.class, () -> it.remove());
        check(it.next().equals("A")); it.remove();
        expect(IllegalStateException.class, () -> it.remove());
        check(it.next().equals("A")); it.remove();
        check(it.next() == null); it.remove();
        check(list.isEmpty());
        expect(NoSuchElementException.class, () -> it.next());
        Iterator<String> stale = list.iterator(); list.add("B");
        expect(ConcurrentModificationException.class, () -> stale.next());
        System.out.println("PASS: 5000 randomized operations, boundaries, nulls, growth and iterators");
    }
}
