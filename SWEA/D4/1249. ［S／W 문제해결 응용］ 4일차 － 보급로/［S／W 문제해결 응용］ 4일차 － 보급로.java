
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int N;
    static int arr[][];
    static int dist[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            dist = new int[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }

            bfs();

            System.out.println("#" + t + " " + dist[N - 1][N - 1]);
        }
    }

    private static void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));
        dist[0][0] = 0;
        
        while (!q.isEmpty()) {
            Point poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    int nextCost = arr[nx][ny] + dist[poll.x][poll.y];

                    if (nextCost < dist[nx][ny]) {
                        dist[nx][ny] = nextCost;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }

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
