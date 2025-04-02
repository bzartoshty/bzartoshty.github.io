public class TestSum {
   public static void main(String[] args) {
      System.out.println("Sum from 1 to 10 is "+sum(1,10));
      System.out.println("Sum from 20 to 30 is "+sum(20,30));
      System.out.println("Sum from 35 to 45 is "+sum(35,45));
      System.out.println("Max of 10 ,5, 15 is "+ TestMax.max(TestMax.max(10,5),15));
   }

   public static int sum(int n1, int n2) {
      int sum = 0;
      for(int i=n1;i<=n2;++i) {
         sum = sum + i;
      }
      return sum;
   }

}