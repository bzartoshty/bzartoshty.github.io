/**
 * COMP 110 - Chapter 6: Methods
 * Slides 9: Overload a name using different parameter types.
 * Run: java MethodSignatureDemo
 */
public class MethodSignatureDemo {
    static String describe(int number) {
        return "describe(int): " + number;
    }

    static String describe(double number) {
        return "describe(double): " + number;
    }

    // Parameter names and return types do not distinguish overloads.
    // This would duplicate describe(int) and fail to compile:
    // static double describe(int differentName) { return differentName; }

    public static void main(String[] args) {
        System.out.println(describe(7));
        System.out.println(describe(7.5));
    }
}
