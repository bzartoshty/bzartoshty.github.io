/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 37
 */
public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity());
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
