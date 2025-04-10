
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int H, W;
    static char arr[][];
    static boolean visited[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            arr = new char[H][W];
            visited = new boolean[H][W];

            int result = 0;
            for (int i = 0; i < H; i++) {
                String str = br.readLine();
                for (int j = 0; j < W; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (arr[i][j] == '#' && !visited[i][j]) {
                        bfs(i, j);
                        result++;
                    }
                }
            }

            System.out.println(result);

        }
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        Node node = new Node(x, y);
        q.offer(node);
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && nx < H && ny >= 0 && ny < W && !visited[nx][ny] && arr[nx][ny] == '#') {
                    q.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                }

            }
        }

    }


    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

}
