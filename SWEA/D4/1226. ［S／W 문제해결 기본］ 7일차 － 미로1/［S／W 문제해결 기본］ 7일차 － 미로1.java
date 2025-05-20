
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    static boolean found;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int caseNum = Integer.parseInt(br.readLine());
            arr = new int[16][16];
            visited = new boolean[16][16];
            found = false;
            int startX = 0;
            int startY = 0;
            for (int i = 0; i < 16; i++) {
                String str = br.readLine();
                for (int j = 0; j < 16; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                    if (arr[i][j] == 1) {
                        visited[i][j] = true;
                    }
                    if (arr[i][j] == 2) {
                        startX = i;
                        startY = j;
                    }
                }
            }
            dfs(startX, startY);
            sb.append("#").append(t).append(" ").append(found ? 1 : 0).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        if (found) {
            return;
        }
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < 16 && ny >= 0 && ny < 16 && !visited[nx][ny]) {
                if (arr[nx][ny] == 3) {
                    found = true;
                    return;
                }
                if (arr[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }

}
