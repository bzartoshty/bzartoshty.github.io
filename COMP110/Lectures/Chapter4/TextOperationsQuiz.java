/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 68
 */
public class TextOperationsQuiz {
    public static void main(String[] args) {
        String text = "banana";
        System.out.println(text.indexOf('a', 1));
        System.out.println(text.lastIndexOf('a', 3));
        System.out.println(text.substring(1, 3));
        System.out.println("Java".equals("java"));
        System.out.println(Integer.parseInt("12") + 3);
    }
}
