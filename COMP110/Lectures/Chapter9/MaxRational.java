import java.util.*;
public class MaxRational {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   
      System.out.print("Enter n: ");
      int n=in.nextInt();
   
      Rational max = new Rational(-1,1);
      for(int i=1;i<=n;++i) {
         Rational r = new Rational(10+(int)(Math.random()*11),10+(int)(Math.random()*11));
         System.out.print(r+"  ");
         if(r.compareTo(max)>0)
            max=r;
      }
      System.out.println("\n"+"Maximum is "+max);
   }
}

   
