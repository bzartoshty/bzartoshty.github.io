/**
 * COMP 110 - Chapter 6: Methods
 * Slides 26: Run examples that answer the contracts and boundary-test quiz.
 * Run: java ContractsQuiz
 */
public class ContractsQuiz {
    static int gcd(int a, int b) {
        int k = Math.min(a, b);
        while (k >= 2) {
            if (a % k == 0 && b % k == 0) {
                return k;
            }
            k--;
        }
        return 1;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int divisor = 2; divisor <= n / divisor;
             divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }

    public static char letterGrade(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        System.out.println("1. gcd(9, 12) = " + gcd(9, 12));
        System.out.println("2. isPrime(1) = " + isPrime(1));
        System.out.println("3. Threshold tests: " + letterGrade(89) + " then " + letterGrade(90));
        System.out.println("4. (0, 7) and (-2, 6) violate the positive-input precondition.");
    }
}
