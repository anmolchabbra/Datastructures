package stack;

import java.util.Stack;

/**
 * This Class checks that string is whether balanced or unbalanced,
 * iff unbalanced it gives 1-based index of unmatched bracket.
*/
class MatchingBrackets {
    /**
     * This method is used to check whether string is balanced or not,
     * If the string is balanced then it returns -1 and if it is not balanced
     * then it output the 1-based index of the first unmatched closing bracket,
     * and if there are no unmatched closing brackets,
     * output the 1-based index of the first unmatched opening bracket.
     * @param string placeholder.
     * @return placeholder.
     */
    public int balanced(final String string) {
        // using stack to check parenthesis
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> stack1 = new Stack<Integer>();
        int i = 0;
        for ( ; i < string.length(); i++) {
            char currentc = string.charAt(i);
            if ((currentc == '{') || (currentc == '[') || (currentc == '(')) {
                stack.push(currentc);
                stack1.push(i);
            } else if (currentc == '}' || currentc == ']' || currentc == ')') {
                if (stack.empty()) {
                    return i + 1;
                } else {
                    char matchingbracket;
                    if (currentc == '}') {
                        matchingbracket = '{';
                    } else if (currentc == ']') {
                        matchingbracket = '[';
                    } else {
                        matchingbracket = '(';
                    }
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
            i = (stack1.peek() + 1);
           return i;
        }
    }

    /**
     * main method.
     * @param args arguments.
     */
    public static void main(final String[] args) {
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
