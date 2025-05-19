
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int arr[][];
    static boolean visited[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    static int x, y;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int T = Integer.parseInt(br.readLine());
            arr = new int[16][16];
            visited = new boolean[16][16];
            Point start = null;
            for (int i = 0; i < 16; i++) {
                String str = br.readLine();
                for (int j = 0; j < 16; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                    if (arr[i][j] == 1) {
                        visited[i][j] = true;
                    }
                    if (arr[i][j] == 2) {
                        start = new Point(i, j);
                    }
                }
            }

            int result = bfs(start);
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static int bfs(Point start) {
        Queue<Point> q = new LinkedList<>();
        q.offer(start);
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx >= 0 && nx < 16 && ny >= 0 && ny < 16 && !visited[nx][ny]) {
                    if (arr[nx][ny] == 3) {
                        return 1;
                    }
                    if (arr[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }
        return 0;
    }


    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
