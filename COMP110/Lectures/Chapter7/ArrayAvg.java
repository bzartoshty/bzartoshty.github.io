public class ArrayAvg {
   public static void main(String[] args) {
      
      int[] list = new int[10];
      int sum=0;
      for(int i=0;i<list.length;++i){
      list[i]=(int)(Math.random()*101);
      sum = sum+list[i];
      }
      double avg = (double)sum/list.length;
      int cnt=0;
      for(int i=0;i<list.length;++i){
       if(list[i]>avg){
        cnt++;
       }
      }
      System.out.println(cnt+ " values are above avg of " + avg);
      
      
   
   }
}