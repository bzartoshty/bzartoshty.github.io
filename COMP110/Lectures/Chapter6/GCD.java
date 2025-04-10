import java.util.Scanner; 

public class GCD {
   /** Main method */
   public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);
   
      // Prompt the user to enter two integers
      System.out.print("Enter first integer: ");
      int n1 = input.nextInt();
      System.out.print("Enter second integer: ");
      int n2 = input.nextInt();
   
            System.out.println("The greatest common divisor for " + n1 +
         " and " + n2 + " is " + gcd(n1,n2));
   }
   
   public static int gcd(int n1, int n2) {
     int gcd = 1;
      int k = Math.min(n1,n2);
      while (k >= 2) {
         if (n1 % k == 0 && n2 % k == 0){
            gcd = k;
            break;
         }
         k--;
      }
      return gcd;
   

   }
}