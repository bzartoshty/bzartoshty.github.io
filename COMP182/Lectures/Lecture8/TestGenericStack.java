import java.util.*;
public class TestGenericStack {
 public static void main(String[] args){
 GenericStack<Integer> s = new GenericStack<>();
  s.push(10);
  s.push(20);
  s.push(5);
  System.out.println(s);
  System.out.println(s.peek());
  //System.out.println(s.pop());
  System.out.println(s.search(10));
  System.out.println(s.search(5));
}
}


  