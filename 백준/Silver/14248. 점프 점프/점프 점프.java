
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int arr[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int s = Integer.parseInt(br.readLine());

        visited[s] = true;
        dfs(s);

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (visited[i]) {
                result++;
            }
        }

        System.out.println(result);
    }

    private static void dfs(int s) {

        int right = s + arr[s];
        int left = s - arr[s];

        if (right > 0 && right <= N && !visited[right]) {
            visited[right] = true;
            dfs(right);
        }
        if (left > 0 && left <= N && !visited[left]) {
            visited[left] = true;
            dfs(left);
        }

    }
}
