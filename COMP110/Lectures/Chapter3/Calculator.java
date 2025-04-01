import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two integer values: ");
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      System.out.print("Enter an operator (*,/,%,+,-): ");
      String op = input.next();
      int result = 
         switch(op) {
            case "*" -> {
               yield n1 * n2;
            }
            case "/" -> {
               yield n1 / n2;
            }
            case "%" -> {
               yield n1 % n2;
            }
            case "+" -> {
               yield n1 + n2;
            }
            case "-" ->
            {
               yield n1 - n2;
            }
            default -> {
               System.out.println("Illegal operator");
              
               System.exit(1);
                yield 0;
            }
         };
      System.out.println(n1+ " "+op+" "+n2+" = "+result);
   }
}
    
    
    
