
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C, K;
    static char arr[][];
    static boolean visited[][];
    static int result;
    static int dx[] = {0, -1, 1, 0};
    static int dy[] = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new char[R][C];
        visited = new boolean[R][C];


        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == 'T') {
                    visited[i][j] = true;
                }
            }
        }

        visited[R - 1][0] = true;
        dfs(R - 1, 0, 1);
        System.out.println(result);

    }

    private static void dfs(int x, int y, int num) {
        if (x == 0 && y == C - 1) {
            if (num == K) result++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny, num + 1);
                visited[nx][ny] = false;
            }

        }

    }
}
