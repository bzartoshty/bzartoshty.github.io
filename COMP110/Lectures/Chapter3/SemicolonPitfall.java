/**
 * COMP 110 - Chapter 3: Selections
 * Slides 22
 * Minimum Java version for this source: 8
 * Assumptions: Intentional logic error: stray semicolon ends the controlled statement.
 */
public class SemicolonPitfall {
    public static void main(String[] args) {
        int score = 50;
        if (score >= 90); // accidental empty statement
        {
            System.out.println("High score");
        }
        System.out.println("Finished");
    }
}
