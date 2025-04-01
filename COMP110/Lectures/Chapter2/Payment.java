import java.util.*;
public class Payment {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter loan amount: ");
      double amount = input.nextDouble();
      System.out.print("Enter interest rate: ");
      double interestRate = input.nextDouble();
      System.out.print("Enter number of years: ");
      int years = input.nextInt();
      double monthlyInterestRate = interestRate / 1200;
      double monthlyPayment = (amount * monthlyInterestRate) / (1.0-(1.0/Math.pow(1+monthlyInterestRate,years*12)));
      double totalPayment = monthlyPayment * 12 * years;
      System.out.printf("Monthly payment: $%.2f\n",monthlyPayment);
      System.out.printf("Total Payment: $%.2f\n",totalPayment);
   }
}
