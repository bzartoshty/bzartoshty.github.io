import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 19
 * Minimum Java version for this source: 8
 * Assumptions: Hypothetical admission rule: at least 18 and has a ticket.
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age and ticket (true/false): ");
        int age = input.nextInt();
        boolean hasTicket = input.nextBoolean();
        if (age >= 18) {
            if (hasTicket) {
                System.out.println("Admit");
            } else {
                System.out.println("Ticket required");
            }
        } else {
            System.out.println("Age requirement not met");
        }
    }
}
