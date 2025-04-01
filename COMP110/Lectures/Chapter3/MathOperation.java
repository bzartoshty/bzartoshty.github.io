import java.util.*;
public class MathOperation {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter two integer values");
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      System.out.print("Enter an operator (+,-,*,/,%): ");
      char op = in.next().charAt(0);
      int result=0;
      switch(op) {
         case '+':
            result = n1+n2;
            break;
         case '-':
            result = n1-n2;
            break;
         case '*':
            result = n1*n2;
            break;
         case '/':
            result = n1/n2;
            break;
         case '%':
            result = n1%n2;
            break;
         default:
            System.out.println("Illegal operator");
            System.exit(1);
      }
      System.out.println(n1+" "+op+" "+n2+" = "+result);
   }
}