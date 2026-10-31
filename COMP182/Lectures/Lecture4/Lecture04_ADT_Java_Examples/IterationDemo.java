import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int value : values) System.out.print(value + " ");
        System.out.println();
        Iterator<Integer> it = values.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) it.remove();
        }
        System.out.println(values);
        values.forEach(System.out::println);
    }
}
