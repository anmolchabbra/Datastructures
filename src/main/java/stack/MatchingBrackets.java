package stack;

import java.util.Stack;
import java.lang.String;


class MatchingBrackets {

    public int balanced(String string) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> stack1 = new Stack<Integer>();
        int i = 0;
        for ( ; i < string.length(); i++ ) {
            char currentc = string.charAt(i);
            if ((currentc == '{') || (currentc == '[') || (currentc == '(')) {
                stack.push(currentc);
                stack1.push(i);
            } else if (currentc == '}' || currentc == ']' || currentc == ')') {
                if (stack.empty()) {
                    return i + 1;
                } else {
                    char matchingbracket = (currentc == '}' ? '{' : currentc == ']' ? '[' : '(');
                    char topElement = stack.peek();
                    if (topElement == matchingbracket) {
                        stack.pop();
                        stack1.pop();
                    } else {
                        return i + 1;
                    }
                }
            }
        }
        if (stack.isEmpty() && stack1.isEmpty()) {
            return -1;
        } else {
            i = (stack1.peek()+ 1);
           return i;
        }
    }
    public static void main(String[] args) {
        String string = "foo{}{";
        MatchingBrackets matcher = new MatchingBrackets();
        int s = matcher.balanced(string);
        if (s == -1) {
            System.out.println("Success");
        } else {
            System.out.println(matcher.balanced(string));
        }
    }
}
