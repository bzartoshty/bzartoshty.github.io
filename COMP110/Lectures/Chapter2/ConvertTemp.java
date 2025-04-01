import java.util.*;
public class ConvertTemp
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Fahreheit: ");
      double fahrenheit = input.nextDouble();
      double celsius = (5.0/9) * (fahrenheit-32);
      System.out.println(fahrenheit+" farenheit is " + celsius + " celsius");
           
   }
     
}
