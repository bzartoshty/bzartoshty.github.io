/**
 * COMP 110 - Chapter 6: Methods
 * Slides 25: Use isPrime to print five rows of ten primes.
 * Run: java First50Primes
 */
public class First50Primes {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int divisor = 2; divisor <= n / divisor;
             divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int candidate = 2;
        while (count < 50) {
            if (isPrime(candidate)) {
                count++;
                System.out.printf("%4d", candidate);
                if (count % 10 == 0) System.out.println();
            }
            candidate++;
        }
    }
}
