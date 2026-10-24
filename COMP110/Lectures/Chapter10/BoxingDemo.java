/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 41
 */
public class BoxingDemo {
    public static void main(String[] args) {
        Integer boxed = 7;
        int primitive = boxed;
        Integer[] values = {1, 2, 3};
        int sum = 0;
        for (Integer value : values) sum += value;
        System.out.println(primitive);
        System.out.println(sum);
        System.out.println(Integer.valueOf(1000).equals(
            Integer.valueOf(1000)));
    }
}
