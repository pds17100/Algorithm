package 그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 양치기꿍 {
    static int R, C;
    static char arr[][];
    static boolean visited[][];
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    static int totalSheep = 0;
    static int totalWolf = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && arr[i][j] != '#') {
                    bfs(i, j);
                }
            }
        }

        System.out.println(totalSheep + " " + totalWolf);
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        visited[x][y] = true;

        int sheep = 0;
        int wolf = 0;

        if (arr[x][y] == 'k') {
            sheep++;
        } else if (arr[x][y] == 'v') {
            wolf++;
        }

        while (!q.isEmpty()) {
            Node now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && arr[nx][ny] != '#') {
                    visited[nx][ny] = true;
                    q.offer(new Node(nx, ny));

                    if (arr[nx][ny] == 'k') sheep++;
                    else if (arr[nx][ny] == 'v') wolf++;
                }
            }
        }

        if(sheep>wolf) totalSheep += sheep;
        else totalWolf += wolf;
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
