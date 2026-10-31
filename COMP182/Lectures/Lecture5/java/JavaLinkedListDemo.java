import java.util.LinkedList;
import java.util.ListIterator;

public class JavaLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.addLast("Baker"); names.addFirst("Adams");
        System.out.println(names.getFirst()); // Adams
        System.out.println(names.removeLast()); // Baker
        names.addLast("Clark");
        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) {
            if (it.next().equals("Adams")) it.add("Baker");
        }
        System.out.println(names); // [Adams, Baker, Clark]
        it = names.listIterator(names.size());
        while (it.hasPrevious()) System.out.println(it.previous());
        // Clark, Baker, Adams on separate lines
    }
}
