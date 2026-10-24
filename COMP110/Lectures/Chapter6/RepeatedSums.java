/**
 * COMP 110 - Chapter 6: Methods
 * Slides 3-4: Calculate three sums using repeated loops.
 * Run: java RepeatedSums
 */
public class RepeatedSums {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 20; i <= 30; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 35; i <= 45; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
