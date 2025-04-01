/* File: AreaOfCircle2.java
   Bahram Zartoshty
   Calculate area of a circle with radius 20
*/
import java.util.*;
public class AreaOfCircle2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      // prompt for radius
      System.out.println("Enter the radius: ");
      double radius = input.nextDouble();
      double area = radius * radius * Math.PI;
      System.out.println("The area of a circle with radius "+radius+" is "+area);
   }
}