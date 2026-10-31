import java.util.ArrayDeque;
import java.util.Deque;

/** Slides 2-4, 8-11. Run with: java StackDemo */
public final class StackDemo {
    public static String reverse(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.append(stack.pop());
        return result.toString();
    }
    public static void main(String[] args) {
        GenericStack<Integer> custom = new GenericStack<>();
        for (int n : new int[] {10, 20, 30}) custom.push(n);
        System.out.println("peek = " + custom.peek() + ", size = " + custom.getSize());
        while (!custom.isEmpty()) System.out.println("pop = " + custom.pop());
        System.out.println("CAT reversed = " + reverse("CAT"));
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10); stack.push(20);
        System.out.println("ArrayDeque peek = " + stack.peek());
        System.out.println("ArrayDeque pop = " + stack.pop());
        stack.clear();
        System.out.println("Empty ArrayDeque peek = " + stack.peek());
        // ArrayDeque rejects null. Its empty pop throws NoSuchElementException.
        // GenericStack's empty peek also throws, as specified by our contract.
    }
}
