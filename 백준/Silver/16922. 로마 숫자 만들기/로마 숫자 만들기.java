
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int answer;
    static boolean visited[] = new boolean[1001];
    static int num[] = {1, 5, 10, 50};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(0, 0, 0);
        System.out.println(answer);
    }

    private static void dfs(int depth, int sum, int idx) {
        if (depth == N) {
            if (!visited[sum]) {
                visited[sum] = true;
                answer++;
            }
            return;
        }
        for (int i = idx; i < 4; i++) {
            dfs(depth + 1, sum + num[i], i);
        }
    }
}
