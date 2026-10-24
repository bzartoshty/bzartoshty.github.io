/**
 * COMP 110 - Chapter 6: Methods
 * Slides 11: Reveal answers to the vocabulary quiz.
 * Run: java MethodVocabularyQuiz
 */
public class MethodVocabularyQuiz {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("1. Arguments in max(7, 12): 7 and 12");
        System.out.println("2. square(int) returns: " + square(5));
        System.out.println("3. Renaming a parameter does not create an overload.");
    }
}
