
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static int N, K;
    static String arr[];
    static boolean visited[];
    static HashSet<String> hashSet = new HashSet<>();
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        arr = new String[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        dfs(0,"");
        System.out.println(result);
    }

    private static void dfs(int depth, String str) {
        if (depth == K && !hashSet.contains(str)) {
            hashSet.add(str);
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, str + arr[i]);
                visited[i] = false;
            }
        }


    }
}
