
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {1, 0, 0, -1};
    static int t = 0, cnt = 0; // t: 시간, cnt: 남은 치즈 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new int[R][C];

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < C; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) cnt++; // 치즈 개수 카운트
            }
        }

        int lastMelted = 0; // 마지막으로 녹은 치즈 개수 저장
        while (cnt > 0) { // 치즈가 남아있을 때 계속 반복
            lastMelted = bfs();
            t++;
        }

        System.out.println(t);
        System.out.println(lastMelted);
    }

    private static int bfs() {
        Queue<Node> q = new LinkedList<>();
        visited = new boolean[R][C];
        q.add(new Node(0, 0));
        visited[0][0] = true;

        int melted = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny]) {
                    visited[nx][ny] = true;

                    if (arr[nx][ny] == 1) { // 치즈라면 녹이기
                        arr[nx][ny] = 0;
                        melted++;
                    } else { // 공기라면 BFS 확장
                        q.add(new Node(nx, ny));
                    }
                }
            }
        }

        cnt -= melted; // 남은 치즈 개수 업데이트
        return melted;
    }

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
