/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 66
 */
public class StringNumberConversion {
    public static void main(String[] args) {
        int count = Integer.parseInt("123");
        double amount = Double.parseDouble("12.5");
        String countText = String.valueOf(count);
        String joined = amount + "";
        System.out.println(count + 1);
        System.out.println(amount * 2);
        System.out.println(countText + 1);
        System.out.println(joined);
    }
}
