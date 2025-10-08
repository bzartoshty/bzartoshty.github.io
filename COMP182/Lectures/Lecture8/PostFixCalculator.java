import java.util.Stack;
import java.util.StringTokenizer;

public class PostFixCalculator {
	 private String postfixExp;
	   private Stack<Double> valueStack;
	   private double result;   

	   public PostFixCalculator(String exp)
	   {
		  postfixExp=exp;
	      valueStack = new Stack<Double>();
	      result = 0.0;
	   }
	   
	   public Double evaluate()
	   {
		   
	      StringTokenizer st = new StringTokenizer(postfixExp," ");
	      while(st.hasMoreTokens())      
	      {
	         String token = st.nextToken();
	                 // if(Character.isDigit(tokens[i].charAt(0)) || tokens[i].charAt(0)=='.'){
	         try {
	            double num = Double.parseDouble(token);
	            valueStack.push(num);
	            continue;
	         
	         } catch (NumberFormatException e) {}
	         valueStack.push(evaluate(token));
	      }
	      return valueStack.pop();
	   }
	   
	   private double evaluate(String ch)
	   {
		   Double op2=valueStack.pop();
           Double op1=valueStack.pop();
	   
	      switch(ch)
	      {
	         case "*": 	
	                   	return op1 * op2;
	         case "/": 	
             			return op1 / op2;
	         case "%":	
             			return op1 % op2;
	         case "+":	
             			return op1 + op2;
	         case "-": 
	        	 		return op1 - op2;
	         default: 
	        	 		return 0;
	      }
	   }
	   

}
