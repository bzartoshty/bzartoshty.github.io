import java.util.*;
public class TotalArea {
   public static void main(String[] args) {
      Random rand = new Random();
      Circle[] arrayCircle = new Circle[5];
      for(int i=0; i<5; ++i){
         arrayCircle[i] = new Circle(rand.nextInt(20)+1);
         System.out.println("Circle with radius  "+arrayCircle[i].getRadius()+" has area of "+String.format("%.2f",arrayCircle[i].getArea()));
      }
      System.out.println("Total area is: "+sum(arrayCircle));
   }
      
   public static double sum(Circle[] list) {
      double totalArea = 0;
      for(int i=0; i<list.length;++i) {
         totalArea = totalArea + list[i].getArea();
      
      }
      return totalArea;
   }
}