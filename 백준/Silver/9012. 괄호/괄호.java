
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(j));
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }

        }
        System.out.println(sb);
    }
}
