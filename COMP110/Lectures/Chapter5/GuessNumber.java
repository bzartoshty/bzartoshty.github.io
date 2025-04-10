import java.util.Scanner; 

public class GuessNumber {
   public static void main(String[] args) {
      // Generate a random number to be guessed
      int number = (int)(Math.random() * 101);
   
      Scanner input = new Scanner(System.in);
      System.out.println("Guess a magic number between 0 and 100");
   
      int guess = input.nextInt();
   
      while (guess != number) {
         // Prompt the user to guess the number
         
         if (guess > number)
            System.out.println("Your guess is too high");
         else
            System.out.println("Your guess is too low");
         System.out.print("\nEnter your guess: ");
         guess = input.nextInt();
      
      } // End of loop
               System.out.println("Yes, the number is " + number);
      
   }
}