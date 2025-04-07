import java.util.*;
public class TestGenericQueue {

   public static void main(String[] args) {
   	// TODO Auto-generated method stub
      Queue<Character> queue = new LinkedList<>();
      Stack<Character> stack = new Stack<>();
      String s = "A man12 4 , ! A 23 Plan 89,!# A CA@#$%NAL&^#%$#PAnamA!".toLowerCase();
      for(int i=0;i<s.length();++i) {
         if(Character.isLetter(s.charAt(i))) {
            stack.push(s.charAt(i));
            queue.offer(s.charAt(i));
         	
         }
      	
      }
      while(!stack.isEmpty()) {
         if(!stack.pop().equals(queue.remove())) {
            System.out.println(s+" is not a palandirome");
            System.exit(0);
         }
      }
   	
      System.out.println(s+" is a palandirome");
   	
   }

}
