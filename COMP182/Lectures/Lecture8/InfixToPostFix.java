import java.util.*;
public class InfixToPostFix
{
   private String infixExp;
   private Stack<String> opStack;
   private String postfix;   

   public InfixToPostFix(String exp)
   {
      infixExp=exp;
      postfix="";
      opStack = new Stack<String>();
   
   }
   
   public String convert()
   {
      infixExp = "( " + infixExp + " )";
      StringTokenizer st = new StringTokenizer(infixExp," +-*/%()",true);
      while(st.hasMoreTokens())      
      {
         String token = st.nextToken();
                 
         try {
            double num = Double.parseDouble(token);
            postfix = postfix + num + " ";
            
         
         } catch (NumberFormatException e){
         if(token.equals(" ")) continue;
         if (token.equals("(")){
            opStack.push(token);
            
         }
         else { 
            if (token.equals(")")){
               while(!opStack.peek().equals("("))
                  postfix = postfix + opStack.pop() + " ";
               opStack.pop();
               
            } else{
               if(precedence(token) > precedence(opStack.peek()))
                  opStack.push(token);
               else {
                  while (precedence(token) <= precedence(opStack.peek())) 
                     postfix = postfix + opStack.pop() + " ";
                  opStack.push(token);
               }
            }
         }  
         
      }
      }
     
      return postfix;
   }
   
   private int precedence(String ch)
   {
      switch(ch)
      {
         case "*":
         case "/": 
         case "%":
            return 3;
         case "+":
         case "-": 
            return 2;
         default: 
            return 1;
      }
   }
   
   
  
}