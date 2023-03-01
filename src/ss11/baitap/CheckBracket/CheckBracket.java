package ss11.baitap.CheckBracket;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);

            if (char1 == '(' || char1 == '[' || char1 == '{') {
                stack.push(char1);
            } else if (char1 == ')' || char1 == ']' || char1 == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((char1 == ')' && top != '(') || (char1 == ']' && top != '[') || (char1 == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
