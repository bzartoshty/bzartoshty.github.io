/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 54
 */
public class VariableErrors {
    public static void main(String[] args) {
        double interestRate = 0.05;
        double interest = interestRate * 45;
        int count;
        count = 3;
        System.out.println(interest);
        System.out.println(count);
        // double wrong = interestrate * 45; // undeclared name
        // int neverSet;
        // System.out.println(neverSet); // not initialized
    }
}
