/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 46
 */
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String text = "Java";
        String alias = text;
        text = text.concat("!");
        System.out.println(alias);
        System.out.println(text);
        String empty = new String();
        System.out.println(empty.length());
    }
}
