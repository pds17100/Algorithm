
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    static int N;
    static int arr[][];
    static int dist[][];
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dist = new int[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
                dist[i][j] = INF;
            }
        }

        bfs();

        System.out.println(dist[N - 1][N - 1]);

    }

    private static void bfs() {
        Deque<Point> dq = new LinkedList<>();
        dq.offer(new Point(0, 0));
        dist[0][0] = 0;

        while (!dq.isEmpty()) {
            Point point = dq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }

                if (arr[nx][ny] == 1) { //흰방
                    if (dist[nx][ny] > dist[point.x][point.y]) {
                        dist[nx][ny] = dist[point.x][point.y];
                        dq.addFirst(new Point(nx, ny));
                    }
                } else {    //검은방
                    if (dist[nx][ny] > dist[point.x][point.y] + 1) {
                        dist[nx][ny] = dist[point.x][point.y] + 1;
                        dq.addLast(new Point(nx, ny));
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
