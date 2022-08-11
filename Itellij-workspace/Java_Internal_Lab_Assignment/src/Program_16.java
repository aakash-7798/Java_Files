
//  Written By Aakash Nadupalli

//16. Write a Java program for converting infix expression into postfix form.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Program_16 {
    public static int precedence(char ch)
    {
        if(ch=='+' || ch=='-') {return 0;}
        else if (ch=='*' || ch=='/') {return 1;}
        else if(ch=='^') {return 2;}
        return -1;
    }
    public static String ConvertInfixToPostfix(String expression)
    {
        String postfix_expression = " ";
        Stack<Character> stck = new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            char ch = expression.charAt(i);
            if(Character.isLetterOrDigit(ch)) {postfix_expression += ch;}
            else if (ch=='(') {stck.push(ch);}
            else if(ch==')') {
                while (!stck.isEmpty() && stck.peek()!='('){
                    postfix_expression+=stck.pop();
                }
                stck.pop();
            }
            else{
                while (!stck.isEmpty() && precedence(ch)<=precedence(stck.peek())){
                    postfix_expression+=stck.pop();
                }
                stck.push(ch);
            }
        }
        while (!stck.isEmpty()){
            if(stck.peek()=='('){return "Not Valid Expression";}
            postfix_expression+=stck.pop();
        }
        return postfix_expression;
    }

    public static void main(String[] args) {
        List<String> exps = Arrays.asList("a+b","a+b+c/d(e*f)","(f+g*h)","a+b*c+d","(a+b)*(c+d)");
        List<String> result = new ArrayList<>();
        for(int i=0;i<exps.size();i++)
        {
            result.add(ConvertInfixToPostfix(exps.get(i)));
            System.out.println("Infix Expression    "+"   PostFix Expression");
            System.out.println(exps.get(i)+"                "+result.get(i)+"\n");
    }
    }
}
