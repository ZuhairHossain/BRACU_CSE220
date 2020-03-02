package ParenthesesChecker;

import java.util.Stack;

public class ParenthesesChecker {
    public static String checkBalancedParenthesis(String exp) {
        if (exp.isEmpty())
            return "Correct";

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
            if (c == '{' || c == '(' || c == '[')
            {
                stack.push(c);
            }
            if (c == '}' || c == ')' || c == ']')
            {
                if (stack.isEmpty())
                    return "Not Correct";
                char last = stack.peek();
                if (c == '}' && last == '{' || c == ')' && last == '(' || c == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Correct";
            }
        }
        return stack.isEmpty()?"Correct":"Not Correct";
    }

}
