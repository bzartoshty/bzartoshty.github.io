import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPitfallsDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(Arrays.asList(10, 20, 10));
        System.out.println(values.remove(1)); // int means index.
        System.out.println(values.remove(Integer.valueOf(10))); // Object means value.
        System.out.println(values);
    }
}
