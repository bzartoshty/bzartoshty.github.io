import java.util.*;
// abc{defg{hgj} { jhk { jhkjh } }}
public class Braces {
   public static void main(String[] args){
      String string = "abc{{defg{hgj}[] { jhk { jhkjh } }}}(";
      Stack<Character> s1 = new Stack<>();
      Stack<Character> s2 = new Stack<>();
      Stack<Character> s3 = new Stack<>();
      for(int i=0;i<string.length();++i){
         if(string.charAt(i)=='{')
            s1.push('{');
         else if(string.charAt(i)=='[')
            s2.push('[');
         else if(string.charAt(i)=='(')
            s3.push('(');
         else if(string.charAt(i)=='}'){
            if(s1.isEmpty()){
               System.out.println("Missing {");
               System.exit(0);
            }
            s1.pop();
         }
         else if(string.charAt(i)==']'){
            if(s2.isEmpty()){
               System.out.println("Missing [");
               System.exit(0);
            }
            s2.pop();
         }
         else if(string.charAt(i)==')'){
            if(s3.isEmpty()){
               System.out.println("Missing (");
               System.exit(0);
            }
            s3.pop();
         }
      
      
      }
      if(s1.isEmpty())
         System.out.println("Matching {}");
      else
         System.out.println("Missing }");
   
      if(s2.isEmpty())
         System.out.println("Matching []");
      else
         System.out.println("Missing ]");
      if(s3.isEmpty())
         System.out.println("Matching ()");
      else
         System.out.println("Missing )");
   
   
   }
}



