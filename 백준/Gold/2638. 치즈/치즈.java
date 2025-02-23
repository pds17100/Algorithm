import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int map[][];
    static boolean visited[][];
    static ArrayList<Node> cheeseList;
    static int cheeseCnt = 0;
    static int dx[] = {0, 1, -1, 0};
    static int dy[] = {1, 0, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        cheeseList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    cheeseList.add(new Node(i, j));
                    cheeseCnt++;
                }
            }
        }

        int time = 0;
        while (cheeseCnt > 0) {
            time++;
            visited = new boolean[N][M];
            dfs(0, 0);
            melting();
        }

        System.out.println(time);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        map[x][y] = 2;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(nx<0||ny<0||nx>=N||ny>=M) continue;
            if(visited[nx][ny]||map[nx][ny]==1) continue;
            dfs(nx, ny);
        }
    }

    private static void melting() {
        ArrayList<Node> meltedCheese = new ArrayList<>();
        for (Node node : cheeseList) {
            int x = node.x;
            int y = node.y;
            int cnt = 0;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (map[nx][ny] == 2) {
                    cnt++;
                }
            }
            if (cnt >= 2) {
                meltedCheese.add(node);
            }
        }
        
        for (Node node : meltedCheese) {
            map[node.x][node.y] = 0;
            cheeseCnt--;
        }
        cheeseList.removeAll(meltedCheese);
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
