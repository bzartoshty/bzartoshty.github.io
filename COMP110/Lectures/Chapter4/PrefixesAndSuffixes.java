/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 61
 */
public class PrefixesAndSuffixes {
    public static void main(String[] args) {
        String filename = "Chapter04.java";
        System.out.println(filename.startsWith("Chapter"));
        System.out.println(filename.endsWith(".java"));
        System.out.println(filename.endsWith(".JAVA"));
        System.out.println(filename.contains("04"));
    }
}
