import java.util.*;
public class SumRational {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter n: ");
      int n=in.nextInt();
   
      Rational sum = new Rational();
      for(int i=1;i<n;++i) {
         Rational r = new Rational(1,i);
         System.out.print(r+" + ");
         sum = sum.add(r);
      }
      Rational r = new Rational(1,n);
      sum = sum.add(r);
      System.out.print(r+" = "+sum);
   }
}

   
