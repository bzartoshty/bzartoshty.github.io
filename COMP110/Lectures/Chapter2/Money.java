import java.util.*;
public class Money {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   // 1) input amount
      System.out.print("Enter the amount in decimal: ");
      double amount = input.nextDouble();
   // 2) convert amount to cents
      int change = (int)(amount*100);
   // 3) calculate # of dollars
      int dollars = change / 100;
   // 4) calculate the remaining cents
      change = change % 100;
   // 5) calculate # of quarters
      int quarters = change / 25;
   // 5) calculate the remaining cents
      change = change % 25;
   // 6) calculate # of dimes and remaining cents
      int dimes = change / 10;
   // 7) calculate the remaining cents
      change = change % 10;
   // 8) calculate # if nickels
      int nickels = change / 5;
   // 9) calculate the remaining pennies
      int pennies = change % 5;
   // 10) print the results
      System.out.printf("%,10.2f dollars is equal to:\n",amount);
      System.out.println(dollars+ " \"dollar(s)\"");
      System.out.println(quarters+ " quarter(s)");
      System.out.println(dimes+ " dime(s)");
      System.out.println(nickels+ " nickel(s)");
      System.out.println(pennies+ " pennie(s)");
   
   
   
   
      
   }
}