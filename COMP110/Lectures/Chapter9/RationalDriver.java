import java.util.*;
public class RationalDriver {
   public static void main(String[] args){
  
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Rational sum = new Rational();
      for(int i=1;i<=n;++i){
         Rational r = new Rational(1,i);
         if(i!=n)
            System.out.print(r+" + ");
         else
            System.out.print(r);
         sum = sum.add(r);
      }
      System.out.println(" = "+sum);
   
   }
}