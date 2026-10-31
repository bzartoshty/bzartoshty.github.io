/** Slide 22. Trace call entry and return; accept only 0..20 for a long result. */
public final class RecursionDemo {
    public static long factorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be in 0..20");
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    private static long trace(int n, int depth) {
        String indent = new String(new char[depth]).replace('\0', ' ');
        System.out.println(indent + "call factorial(" + n + ")");
        long value = n <= 1 ? 1 : n * trace(n - 1, depth + 2);
        System.out.println(indent + "return " + value);
        return value;
    }
    public static void main(String[] args) { trace(3, 0); }
}
