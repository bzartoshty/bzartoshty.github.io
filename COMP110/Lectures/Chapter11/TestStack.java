/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 60
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("Java");
        stack.push(42);
        stack.push("CS");
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(42));
    }
}
