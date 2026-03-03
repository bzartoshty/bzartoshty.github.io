import java.util.*;
public class Postfix
{
    private static String infixExp;
    private static Stack<String> opStack;
    private static String postfix;
    public static void main(String[] args)
    {
        infixExp = "( 12.0 + 3 ) * 7 + 2";
        postfix = "";
        opStack = new Stack<>();
        System.out.println(convert(infixExp));

    }

    public static String convert(String infixExp){
        infixExp ="( " + infixExp + " )";
        StringTokenizer st = new StringTokenizer(infixExp," ");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            try {
                double num = Double.parseDouble(token);
                postfix = postfix + num + " ";
            }
            catch (NumberFormatException ex) {
                if(token.equals("(")){
                    opStack.push(token);
                    continue;
                }
                else if (token.equals(")")){
                    while(!opStack.peek().equals("(")){
                        postfix = postfix + opStack.pop() + " ";
                    }
                    opStack.pop(); // pop the ( and ignore
                }
                else if(precedence(token) > precedence(opStack.peek())){
                    opStack.push(token);
                }
                else {
                    while(precedence(token) <= precedence(opStack.peek())){
                        postfix = postfix + opStack.pop() + " ";
                    }
                    opStack.push(token);
                }
            }
        }
        return postfix;
    }

    public static int precedence(String op){
        switch(op) {
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
