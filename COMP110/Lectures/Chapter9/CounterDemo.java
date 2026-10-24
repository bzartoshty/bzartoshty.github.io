/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 65
 */
public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount());
        counter.reset();
        System.out.println(counter.getCount());
    }
}
