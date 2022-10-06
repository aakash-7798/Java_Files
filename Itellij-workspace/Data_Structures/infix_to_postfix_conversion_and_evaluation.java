import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.*;

public class infix_to_postfix_conversion_and_evaluation {
    public int precedence(char ch){
        if(ch=='+' || ch=='-'){return 0;}
        else if(ch=='*' || ch=='/'){return 1;}
        else if(ch=='^'){return 2;}
        return -1;
    }
    public String convert(String exps){
        String postfix_expression = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exps.length();i++){
            char ch = exps.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix_expression+=ch;
            }
            else if(ch=='('){
                st.add(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    postfix_expression+=st.pop();
                }
                st.pop();
            }
            else{
                while (!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    postfix_expression+=st.pop();
                }
                st.add(ch);
            }
        }
        while (!st.isEmpty()){
            if(st.peek()=='('){
                return "Invalid Expression";
            }
            postfix_expression+=st.pop();
        }
        return postfix_expression;
    }
    static int evaluatePostfix(String exp) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {stack.push(Integer.parseInt(String.valueOf(ch)));}
            else {
                int b = stack.pop();
                int a = stack.pop();
                if (ch == '+') {stack.push(a + b);}
                if (ch == '-') {stack.push(a - b);}
                if (ch == '*') {stack.push(a * b);}
                if (ch == '/') {stack.push(a / b);}
                if (ch == '^') {stack.push(a ^ b);}
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String ps = "a+b-c/d*e";
        String ps1 = "2+3-6/2*5";
        infix_to_postfix_conversion_and_evaluation inpx =new infix_to_postfix_conversion_and_evaluation();
        String psexp = inpx.convert(ps);
        String psexp1 = inpx.convert(ps1);
        System.out.print(psexp+"\n"+psexp1+"\n");
        System.out.print(evaluatePostfix(psexp1));
    }
}
