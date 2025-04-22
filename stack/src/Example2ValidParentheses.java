import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class Example2ValidParentheses {
    public static boolean isValid(String s) {
        if(s ==null || s.length() ==0){
            return true;
        }
        // Create a new stack with size of the input string
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') {
                stack.push(c);
            } else if(c==')' && stack.peek()=='(') {
                stack.pop();
            } else if(c=='}' && stack.peek()=='{') {
                stack.pop();
            } else if(c==']' && stack.peek()=='[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("()", "([])", "([)]",  "(([]))",  "[");
        for(String s: list){
            System.out.println("String: "+ s +  " , Output: "+ isValid(s));

        }
    }
}
