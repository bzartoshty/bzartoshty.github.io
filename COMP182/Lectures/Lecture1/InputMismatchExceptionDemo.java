import java.util.*;

public class InputMismatchExceptionDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
  
        // Display the result
        System.out.printf(
          "The number entered is |%,10d|" , number);
        
        continueInput = false;
      } 
      catch (InputMismatchException ex) {
        System.out.println("Try again. (" + 
          "Incorrect input: an integer is required)");
        input.nextLine(); // discard input 
      }
    } while (continueInput);
    input.close();
  }
}