
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int map[][];
    static int dx[] = {-1, 0, 0, 1};
    static int dy[] = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int sharkX = 0;
        int sharkY = 0;

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                    map[i][j] = 0;
                }
            }
        }

        int sharkSize = 2;
        int eatCount = 0;
        int totalTime = 0;

        while (true) {
            Fish target = bfs(sharkX, sharkY, sharkSize);

            if (target == null) {
                break;
            }

            totalTime += target.dist;
            sharkX = target.x;
            sharkY = target.y;
            map[sharkX][sharkY] = 0;
            eatCount++;

            if (eatCount == sharkSize) {
                sharkSize++;
                eatCount = 0;
            }
        }

        System.out.println(totalTime);

    }

    private static Fish bfs(int sharkX, int sharkY, int size) {
        boolean visited[][] = new boolean[N][N];
        Queue<Position> q = new LinkedList<>();
        PriorityQueue<Fish> fishes = new PriorityQueue<>();
        q.offer(new Position(sharkX, sharkY, 0));
        visited[sharkX][sharkY] = true;
        int minDist = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            Position now = q.poll();

            if (now.dist > minDist) {
                break;
            }

            if (map[now.x][now.y] != 0 && map[now.x][now.y] < size) {
                fishes.offer(new Fish(now.x, now.y, now.dist));
                minDist = now.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                    if (map[nx][ny] <= size) {
                        visited[nx][ny] = true;
                        q.offer(new Position(nx, ny, now.dist + 1));
                    }
                }

            }

        }

        return fishes.isEmpty() ? null : fishes.poll();

    }


    static class Position {
        int x;
        int y;
        int dist;

        public Position(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static class Fish implements Comparable<Fish> {
        int x;
        int y;
        int dist;

        public Fish(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }


        @Override
        public int compareTo(Fish o) {
            if (this.dist != o.dist) {
                return this.dist - o.dist;
            }

            if (this.x != o.x) {
                return this.x - o.x;
            }

            return this.y - o.y;
        }

    }


}
