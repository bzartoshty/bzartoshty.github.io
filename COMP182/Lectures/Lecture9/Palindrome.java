import java.util.*;
public class Palindrome {
   public static void main(String[] args){
      String line = "amanaplanacanalpanama";
      Stack<Character> s = new Stack<>();
      GenericQueue<Character> q = new GenericQueue<>();
      for(int i=0;i<line.length();++i){
         s.push(line.charAt(i));
         q.enqueue(line.charAt(i));
      }
      while(!s.isEmpty()){
         if(!s.pop().equals(q.dequeue())){
            System.out.println(line+" is not a palindrome");
            System.exit(0);
         }
      }
      System.out.println(line+" is a palindrome");
   }
}

