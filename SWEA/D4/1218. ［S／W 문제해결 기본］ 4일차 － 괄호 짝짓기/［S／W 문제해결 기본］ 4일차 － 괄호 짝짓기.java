
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            Stack<Character> stack = new Stack<>();
            boolean result = true;
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                char top = str.charAt(i);
                if (!stack.isEmpty()) {
                    if(top==')'&& stack.peek()=='(') stack.pop();
                    else if(top==']'&& stack.peek()=='[') stack.pop();
                    else if(top=='}'&& stack.peek()=='{') stack.pop();
                    else if(top=='>'&& stack.peek()=='<') stack.pop();
                    else stack.push(top);
                } else {
                    if (top == ')' || top == ']' || top == '}' || top == '>') {
                        result = false;
                        break;
                    } else {
                        stack.push(top);
                    }
                }
            }

            if (!stack.isEmpty()) {
                result = false;
            }

            sb.append("#").append(t).append(" ").append(result ? 1 : 0).append("\n");
        }
        System.out.println(sb);
    }
}
