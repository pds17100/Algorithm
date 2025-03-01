
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<String> s = new HashSet<>();
    static String arr[][] = new String[5][5];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0, arr[i][j]);
            }
        }

        System.out.println(s.size());
    }

    private static void dfs(int x, int y, int cnt, String num) {
        if (cnt == 5) {
            if (!s.contains(num)) {
                s.add(num);
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                continue;
            }
            dfs(nx, ny, cnt + 1, arr[nx][ny] + num);
        }
    }
}
