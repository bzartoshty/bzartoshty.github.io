/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 15
 */
public class VariablesQuiz {
    public static void main(String[] args) {
        int x, y;
         x = 2; y = x; x = 9;
         System.out.println("x = " + x + ", y = " + y);
         // total and Total are distinct identifiers.
         // A final variable cannot be reassigned after initialization.
         // Reading an uninitialized local variable prevents compilation.
    }
}
