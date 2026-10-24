/**
 * COMP 110 - Chapter 6: Methods
 * Slides 24: Test whether individual integers are prime.
 * Run: java PrimeTestDemo
 */
public class PrimeTestDemo {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int divisor = 2; divisor <= n / divisor;
             divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 9, 13};
        for (int number : numbers) {
            System.out.println(number + ": " + isPrime(number));
        }
    }
}
