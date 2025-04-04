/* Write a program to generate 5 random Rectangles
   length: 10-50
   width: 10-20
   calculate and print sum of their areas
*/
import java.util.*;
public class TestRectangle {
 public static void main(String[] args) {
  Random rand = new Random();
  double sum = 0.0;
  for(int i=1;i<=5;++i){
    int l = rand.nextInt(41)+10;
    int w = rand.nextInt(11)+10;
    Rectangle r = new Rectangle(l,w);
    sum = sum + r.getArea();
   }
   System.out.println(sum);
   }
 }