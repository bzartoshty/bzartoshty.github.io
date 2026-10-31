import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;

/** Explicit checks work without -ea. */
public class LinkedListChecks {
    static void check(boolean ok) { if (!ok) throw new AssertionError(); }
    static void expect(Class<? extends Throwable> type, Runnable action) {
        try { action.run(); }
        catch (Throwable t) { if (type.isInstance(t)) return; throw new AssertionError(t); }
        throw new AssertionError("Expected " + type.getName());
    }
    public static void main(String[] args) {
        SinglyLinkedList<Integer> single = new SinglyLinkedList<>();
        DoublyLinkedList<Integer> doubly = new DoublyLinkedList<>();
        ArrayList<Integer> model = new ArrayList<>();
        Random random = new Random(182);
        for (int step = 0; step < 5000; step++) {
            Integer value = random.nextInt(5) == 0 ? null : random.nextInt(100);
            int op = model.isEmpty() ? 0 : random.nextInt(6);
            if (op == 0) {
                int i = random.nextInt(model.size() + 1);
                single.add(i, value); doubly.add(i, value); model.add(i, value);
            } else if (op == 1) {
                int i = random.nextInt(model.size()); Integer expected = model.remove(i);
                check(Objects.equals(single.remove(i), expected));
                check(Objects.equals(doubly.remove(i), expected));
            } else if (op == 2) {
                single.addFirst(value); doubly.addFirst(value); model.add(0, value);
            } else if (op == 3) {
                single.addLast(value); doubly.addLast(value); model.add(value);
            } else if (op == 4) {
                Integer expected = model.remove(0);
                check(Objects.equals(single.removeFirst(), expected));
                check(Objects.equals(doubly.removeFirst(), expected));
            } else {
                Integer expected = model.remove(model.size() - 1);
                check(Objects.equals(single.removeLast(), expected));
                check(Objects.equals(doubly.removeLast(), expected));
            }
            single.checkInvariants(); doubly.checkInvariants();
            check(single.size() == model.size() && doubly.size() == model.size());
            check(single.toString().equals(model.toString()));
            check(doubly.toString().equals(model.toString()));
            for (int i = 0; i < model.size(); i++) {
                check(Objects.equals(single.get(i), model.get(i)));
                check(Objects.equals(doubly.get(i), model.get(i)));
            }
            ArrayList<Integer> reversed = new ArrayList<>(model);
            java.util.Collections.reverse(reversed);
            check(doubly.reverseString().equals(reversed.toString()));
        }
        SinglyLinkedList<String> s = new SinglyLinkedList<>();
        DoublyLinkedList<String> d = new DoublyLinkedList<>();
        expect(NoSuchElementException.class, () -> s.removeFirst());
        expect(NoSuchElementException.class, () -> s.removeLast());
        expect(NoSuchElementException.class, () -> d.removeFirst());
        expect(NoSuchElementException.class, () -> d.removeLast());
        expect(IndexOutOfBoundsException.class, () -> s.add(1, "A"));
        expect(IndexOutOfBoundsException.class, () -> d.add(-1, "A"));
        expect(IndexOutOfBoundsException.class, () -> s.get(0));
        expect(IndexOutOfBoundsException.class, () -> d.remove(0));
        for (int i = 0; i < 4; i++) {
            s.addLast("A"); d.addFirst("A");
            if (i % 2 == 0) { s.removeFirst(); d.removeLast(); }
            else { s.removeLast(); d.removeFirst(); }
            s.checkInvariants(); d.checkInvariants(); check(s.isEmpty() && d.isEmpty());
        }
        s.addFirst(null); s.addLast("X");
        Iterator<String> it = s.iterator();
        check(it.next() == null); check(it.next().equals("X")); check(!it.hasNext());
        expect(NoSuchElementException.class, () -> it.next());
        expect(UnsupportedOperationException.class, () -> it.remove());
        Iterator<String> stale = s.iterator(); s.addLast("Y");
        expect(ConcurrentModificationException.class, () -> stale.next());
        System.out.println("PASS: 5000 operations on both lists, invariants, boundaries and iteration");
    }
}
