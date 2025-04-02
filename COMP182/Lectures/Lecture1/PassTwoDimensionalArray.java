import java.util.*;

public class PassTwoDimensionalArray {
   public static void main(String[] args) {
      int[][] m = getArray(); // Get a matrix
   // print the matrix
      print(m);
   
    // Display sum of elements
      System.out.println("\nSum of all elements is " + sum(m)+"\n");
    // shuffle the array
      System.out.println("Shuffled matrix");
      shuffle(m);
    // print the matrix
      print(m);
    // Summing elements by column
      System.out.println("Summing elements by column");
      int[] sumCol = sumColumns(m);
      for(int i=0;i<sumCol.length;++i){
         System.out.print(sumCol[i]+" ");
      }
      System.out.println();
    // Which row has the largest sum
      System.out.println("The index of the row with largest sum is "+ LargestRowSum(m));
    // smallest index of the largest element
      int[] index = indexOfLargestElement(m);
      System.out.println("The smallest index of the largest element is ["+index[0]+"]["+index[1]+"]");
    
   }  
   public static int[][] getArray() {
    // Create a Scanner
      Scanner input = new Scanner(System.in);
      Random random = new Random(10);
    // generate array values
      int[][] m = new int[3][4];
      System.out.println("Genertae " + m.length + " rows and "
         + m[0].length + " columns: ");
      for (int i = 0; i < m.length; i++)
         for (int j = 0; j < m[i].length; j++)
            m[i][j] = random.nextInt(10)+1;
   
      return m;
   }

   public static int sum(int[][] m) {
      int total = 0;
      for (int row = 0; row < m.length; row++) {
         for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
         }
      }
   
      return total;
   }
 
   public static void shuffle(int[][] matrix){ 
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            int i1 = (int)(Math.random() * matrix.length);
            int j1 = (int)(Math.random() * matrix[i].length);
         // Swap matrix[i][j] with matrix[i1][j1]
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i1][j1];
            matrix[i1][j1] = temp;
         }
      }
   }

   public static void print(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j]+" ");
         }
         System.out.println();
      }
   }
   
   public static int[] sumColumns(int[][] matrix) {
      int[] colSum = new int[matrix[0].length];
      for (int column = 0; column < matrix[0].length; column++) {
         int total = 0;
         for (int row = 0; row < matrix.length; row++)
            colSum[column] += matrix[row][column];
      }
   
      return colSum;
   }

   public static int LargestRowSum(int[][] matrix) {
      int maxRow = 0;
      int indexOfMaxRow = 0;
   // Get sum of the first row in maxPow
      for (int column= 0; column< matrix[0] . length; column++) {
         maxRow += matrix[0] [column] ;
      }
      for (int row= 1 ; row< matrix.length; row++) {
         int totalOfThisRow = 0;
         for (int column = 0; column< matrix[row].length; column++)
            totalOfThisRow += matrix[row] [column] ;
         if (totalOfThisRow > maxRow) {
            maxRow = totalOfThisRow;
            indexOfMaxRow = row;
         }
      }
      return indexOfMaxRow;
   }
   
   public static int[] indexOfLargestElement(int[][] matrix) {
      int[] index = new int[2];
      int max = matrix[0][0];
    // index by default is [0][0]
      for(int row=0;row<matrix.length;++row) {
         for(int col=0;col<matrix[row].length;++col) {
            if(matrix[row][col]>max){
               index[0]=row;
               index[1]=col;
            }
         }
      }
      return index;
   }
   
}