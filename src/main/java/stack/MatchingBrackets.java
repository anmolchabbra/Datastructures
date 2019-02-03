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
     * @param string String that has to be tested for balanced brackets.
     * @return an integer as described above.
     */
    public int balanced(final String string) {
        // using stack to check parenthesis
        Stack<OpeningBracketAndIndex> stack = new Stack<>();
        for (int i = 0 ; i < string.length(); i++) {
            char currentc = string.charAt(i);
            if ((currentc == '{') || (currentc == '[') || (currentc == '(')) {
                stack.push(new OpeningBracketAndIndex(currentc, i));
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
                    OpeningBracketAndIndex topElement = stack.peek();
                    if (topElement.openingBracket == matchingbracket) {
                        stack.pop();
                    } else {
                        return i + 1;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return -1;
        } else {
           return stack.peek().index + 1;
        }
    }

    private static class OpeningBracketAndIndex {
        char openingBracket;
        int index;

        OpeningBracketAndIndex(char openingBracket, int index) {
            this.openingBracket = openingBracket;
            this.index = index;
        }
    }

    /**
     * Main method for simple testing. Other tests in MatchingBracketsTest
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
