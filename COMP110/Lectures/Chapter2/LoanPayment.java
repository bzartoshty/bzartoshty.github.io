import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 48, 49
 * Assumptions: Positive finite annual percentage rate and principal; 1-100 whole years; ordinary finite sample range. Zero-rate case is outside this version.
 */
public class LoanPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter annual rate (%), years, principal: ");
        double annualRate = input.nextDouble();
        int years = input.nextInt();
        double principal = input.nextDouble();
        double monthlyRate = annualRate / 1200;
        int paymentCount = years * 12;
        double monthlyPayment = principal * monthlyRate
            / (1 - Math.pow(1 + monthlyRate, -paymentCount));
        double totalPayment = monthlyPayment * paymentCount;
        System.out.printf(Locale.US, "Monthly: $%.2f%n", monthlyPayment);
        System.out.printf(Locale.US, "Total: $%.2f%n", totalPayment);
    }
}
