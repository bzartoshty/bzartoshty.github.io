import java.util.*;
public class TestArea {
static Random rnd = new Random();

   public static void main(String[] args){
      
      Circle[] c = new Circle[5];
      createCircles(c);
      printCircles(c);
      double totalArea = totalArea(c);
      System.out.println("Total area is "+totalArea);
      System.out.println("Largest circle is "+getMax(c));
   }
   
   public static Circle getMax(Circle[] c){
      Circle max = c[0];
      for(int i=1;i<c.length;++i){
         if(c[i].getArea() > max.getArea())
            max = c[i];
      }
      return max;
   }
   
  
   public static void createCircles(Circle[] c){
               for(int i=0;i<c.length;++i){
         double radius = 10+rnd.nextInt(11);
         c[i]= new Circle(radius);
      }
   }
   
   public static void printCircles(Circle[] c){
      for(int i=0; i<c.length;++i){
         System.out.println(c[i].getRadius()+" "+c[i].getArea());
      }
   }
   
   public static double totalArea(Circle[] c){
      double sum = 0;
      for(int i=0; i<c.length;++i){
         sum = sum + c[i].getArea();
      }
      return sum;
   }
}