package stack;

import java.util.Stack;
import java.lang.String;


class MatchingBrackets {

    public boolean balanced(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char currentc = string.charAt(i);
            if (currentc == '{' || currentc == '[') {
                stack.push(currentc);
            } else if (currentc == '}' || currentc == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char matchingbracket = currentc == '}' ? '{' : '[';
                    char topElement = stack.peek();
                    if (topElement == matchingbracket) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string = "{}}";
        MatchingBrackets matcher = new MatchingBrackets();
        System.out.println(matcher.balanced(string));
    }
}
