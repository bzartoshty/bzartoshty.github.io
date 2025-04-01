import java.util.*;
public class GrossPay {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hours wroked: ");
      double hours = input.nextDouble();
      System.out.print("Enter pay rate: ");
      double payRate = input.nextDouble();
      double grossPay;
      if(hours <= 40) {
         grossPay = hours * payRate;
      }
      else {
         grossPay = 40 * payRate + 1.5 * payRate * (hours-40);
      }
      System.out.println("Your gross pay is " + grossPay);
   }
}
