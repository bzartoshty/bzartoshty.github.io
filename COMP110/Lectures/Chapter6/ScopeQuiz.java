/**
 * COMP 110 - Chapter 6: Methods
 * Slides 38: Demonstrate separate method scopes and definite assignment.
 * Run: java ScopeQuiz
 */
public class ScopeQuiz {
    static int firstMethod() {
        int x = 1;
        return x;
    }

    static int secondMethod() {
        int x = 2;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(firstMethod());
        System.out.println(secondMethod());

        // Original quiz code would not compile:
        // int total;
        // System.out.println(total); // total has no assigned value.
        int total = 0;
        System.out.println(total);
    }
}
