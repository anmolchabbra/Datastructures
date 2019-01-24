import java.util.Stack;
import java.lang.String;
class MatchingBrackets {

    public static void main(String[] args) {
        //char
        String string = "{]}";

        Stack<Character> stack = new Stack<Character>();
            int i=0;
            for (; i <= string.length() - 1; i++) {
                char currentc = string.charAt(i);
                if (currentc == '{' || currentc == '[') {
                    stack.push(currentc);

                } else {
                        if (currentc == '}' || currentc == ']') {
                            if (stack.empty()) {
                                System.out.println("false \t" +  (i+1));
                                System.exit(0);

                            } else {
                                char topElement = stack.peek();
                                if ((topElement == '{' && currentc != '}' || topElement == '[' && currentc != ']')) {
                                    break;
                                } else {
                                    stack.pop();
                                }
                            }
                        }
                }
            }
            if(stack.empty()) {
            System.out.println("balanced");
            }
            else {
                System.out.println("not balanced \t" + (i+1) );

            }
    }
}


        /*
public class MatchingBrackets {
    int[] MatchingBrackets  = new int[70];
    int top = MatchingBrackets[0];
    void push(char x) {
        MatchingBrackets[top] = x;
        top++;
    }
    public void char pop() {
        return MatchingBrackets[top];
        MatchingBrackets[top] = null;
        top--;
    }

}
*/


