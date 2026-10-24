import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 53
 * Minimum Java version for this source: 8
 */
public class ClassicSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter status 0-3: ");
        int status = input.nextInt();
        switch (status) {
            case 0: System.out.println("Single"); break;
            case 1: System.out.println("Joint"); break;
            case 2: System.out.println("Separate"); break;
            case 3: System.out.println("Head of household"); break;
            default: System.out.println("Invalid status");
        }
    }
}
