import java.util.Stack;
import java.lang.String;
class stack {

    public static void main(String[] args) {
        String[] string = {"hey..add(2+5) and multiply [3*5]] and divide the results{[/}}}"};
        Stack stack = new Stack();
        for (int i = 0; i <= string.length() - 1; i++) {
            if (string[i] = '{' ||'[') {
                stack.push(string[i]);
            }
            else {
                String topElement = (String) stack.pop();
                if ((topElement = '{' && string[i] != '}') ||(topElement = '[' && string[i] !=']')){
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
public class stack {
    int[] stack  = new int[70];
    int top = stack[0];
    void push(char x) {
        stack[top] = x;
        top++;
    }
    public void char pop() {
        return stack[top];
        stack[top] = null;
        top--;
    }

}
*/


