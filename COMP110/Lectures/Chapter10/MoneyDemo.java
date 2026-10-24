/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 10
 */
public class MoneyDemo {
    public static void main(String[] args) {
        Money first = new Money(3, 75);
        Money second = new Money(2, 50);
        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
        Money missing = second.subtract(first);
        System.out.println(missing == null);
        System.out.println(first);
    }
}
