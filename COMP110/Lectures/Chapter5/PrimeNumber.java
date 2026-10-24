/**
 * COMP 110 - Chapter 5: Loops
 * Slides 53, 54
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2, count = 0;
        while (count < 50) {
            boolean prime = true;
            for (int divisor = 2; divisor <= number / divisor; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.printf("%4d", number);
                count++;
                if (count % 10 == 0) System.out.println();
            }
            number++;
        }
    }
}
