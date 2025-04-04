import java.util.*;
public class TotalArea {
   public static void main(String[] args) {
      Random rand = new Random();
      Circle[] arrayCircle = new Circle[5];
      for(int i=0; i<5; ++i){
         arrayCircle[i] = new Circle(rand.nextInt(20)+1);
      }
      double totalArea = 0;
      for(int i=0; i<5;++i) {
      totalArea = totalArea + arrayCircle[i].getArea();
      System.out.println(arrayCircle[i].getRadius()+"  "+arrayCircle[i].getArea());
      }
      System.out.println(totalArea);
   }
}