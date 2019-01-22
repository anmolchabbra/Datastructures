import java.util.Stack;
import java.lang.String;
class MatchingBrackets {

    public static void main(String[] args) {
        //char
        String string = "hey..add(2+5) and multiply [3*5]] and divide the results{[/}}}";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i <= string.length() - 1; i++) {
            char currentc = string.charAt(i);
            if(currentc == '{' || currentc == '[') {
                stack.push(currentc);
            }
            else {
                char topElement = stack.peek();
                if ((topElement == '{' &&  currentc == '}') || (topElement == '[' && currentc !=']')) {

                    System.out.println("it is not balanced");
                }
              else{
                    System.out.println("String is not balanced");
                }
            }
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


