import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 73
 * Assumptions: Simple filename without folder path; last dot separates extension only if not first or last.
 */
public class FileExtension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a simple filename: ");
        String name = input.nextLine();
        int dot = name.lastIndexOf('.');
        if (dot <= 0 || dot == name.length() - 1) {
            System.out.println("No extension");
        } else {
            String extension = name.substring(dot + 1);
            System.out.println(extension.toLowerCase(Locale.ROOT));
        }
    }
}
