
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {-1, 0, 1, 0};   
    static int dy[] = {0, 1, 0, -1};
    static List<Integer> result;
    static int N, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];
        result = new ArrayList<>();
        cnt = 1;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (arr[x][y] == 1 && !visited[x][y]) {
                    dfs(x, y);
                    result.add(cnt);
                    cnt = 1;
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (Integer i : result) {
            System.out.println(i);
        }

    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && arr[nx][ny] == 1) {
                cnt++;
                dfs(nx, ny);
            }
        }
    }
}
