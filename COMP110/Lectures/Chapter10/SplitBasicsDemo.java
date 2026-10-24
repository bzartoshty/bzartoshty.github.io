import java.util.Arrays;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 51
 */
public class SplitBasicsDemo {
    public static void main(String[] args) {
        String[] tokens = "Java#HTML#Perl".split("#");
        System.out.println(Arrays.toString(tokens));
        System.out.println(Arrays.toString("a,b,".split(",")));
        System.out.println(Arrays.toString("a,b,".split(",", -1)));
    }
}
