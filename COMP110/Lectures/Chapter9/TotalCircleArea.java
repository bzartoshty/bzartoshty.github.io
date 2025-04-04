import java.util.*;
public class TotalCircleArea {
   public static void main(String[] args){
      MyCircle[] circleArray = new MyCircle[5];
      createArray(circleArray);
      printCircle(circleArray);
      double totalArea = calculateTotalArea(circleArray);
      System.out.println("Total of areas is: "+totalArea);
   
   }
   
   public static double calculateTotalArea(MyCircle[] list){
      double sum = 0;
      for(int i=0;i<list.length;++i) {
         sum = sum + list[i].getArea();
      }
      return sum;
   }
 
   public static void createArray(MyCircle[] list) {
      Random rand = new Random(10);
      // create circles with random radius beteen 10 and 20
      for(int i=0;i<list.length;++i) {
         list[i] = new MyCircle(10+rand.nextInt(11));
      }
   }
   
   public static void printCircle(MyCircle[] list) {
      for(int i=0;i<list.length;++i) {
         System.out.println(list[i]);
      }
   }

}
  
