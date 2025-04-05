import java.util.Stack;
public class TestStack {
 public static void main(String[] args){
  Stack<Integer> s = new Stack<>();
  for(int i = 1;i<=5;++i)
   s.push((int)(Math.random()*10)+1);
  
   System.out.println(s);
  System.out.println(s.peek());
  System.out.println(s.pop());
  }

  }