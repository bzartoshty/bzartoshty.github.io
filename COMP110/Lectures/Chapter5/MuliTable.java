public class MuliTable {
   public static void main(String[] args) {
      System.out.println("             Multiplication Table");
      System.out.print("    ");
      for(int i=1;i<=9;++i){
         System.out.print(i+"    ");
      }
      System.out.println();
      System.out.println("  --------------------------------------------");
      for(int row=1;row<=9;++row) {
         System.out.print(row+" |");
         for(int col=1;col<=9;++col){
            System.out.printf("%2d   ",row*col);
         }
         System.out.println();
      }
      
   }
}