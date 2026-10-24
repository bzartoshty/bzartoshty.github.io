import java.util.Date;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 34
 */
public class DateObjectDemo {
    public static void main(String[] args) {
        Date date = new Date(0L);
        System.out.println(date.getTime());
        date.setTime(1000L);
        System.out.println(date.getTime());
    }
}
