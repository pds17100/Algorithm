
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(st.nextToken()));
        }

        int sum = 0;
        int cnt = 1;
        while (!stack.isEmpty()) {
            int book = stack.pop();
            sum += book;
            if (sum <= M) {
                continue;
            } else {
                cnt++;
                sum = book;
            }
        }

        System.out.println(cnt);

    }

}
