
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {0, 0, -1};
    static int dy[] = {-1, 1, 0};
    static int startY;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int caseNum = Integer.parseInt(br.readLine());
            arr = new int[100][100];
            visited = new boolean[100][100];

            int endX = 0;
            int endY = 0;

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if (arr[i][j] == 2) {
                        endX = i;
                        endY = j;
                    }
                }
            }

            dfs(endX, endY);
            sb.append("#").append(t).append(" ").append(startY).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        if (x == 0) {
            startY = y;
            return;
        }

        for (int i = 0; i < 3; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 100 && ny >= 0 && ny < 100 && arr[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
                return;
            }
        }
    }
}
