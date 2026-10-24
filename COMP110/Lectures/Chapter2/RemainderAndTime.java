/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 28
 */
public class RemainderAndTime {
    public static void main(String[] args) {
        int totalSeconds = 3672;
        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        System.out.println(hours + " h " + minutes + " m " + seconds + " s");
        System.out.println(17 % 5);
    }
}
