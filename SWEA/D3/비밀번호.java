package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            Stack<Character> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";
            for (int i = 0; i < N; i++) {
                char cur = str.charAt(i);
                if (stack.isEmpty() || cur != stack.peek()) {
                    stack.push(cur);
                } else {
                    stack.pop();
                }
            }
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            StringBuilder sb = new StringBuilder(result);
            System.out.println("#" + t + " " + sb.reverse());
        }
    }
}
