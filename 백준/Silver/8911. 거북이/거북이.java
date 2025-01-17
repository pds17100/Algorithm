
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int minX = 0;
            int minY = 0;
            int maxX = 0;
            int maxY = 0;
            int dir = 0;
            int nowX = 0;
            int nowY = 0;
            String command = br.readLine();
            for (int i = 0; i < command.length(); i++) {
                char c = command.charAt(i);
                if (c == 'F') {
                    nowX = nowX + dx[dir];
                    nowY = nowY + dy[dir];
                } else if (c == 'B') {
                    nowX = nowX - dx[dir];
                    nowY = nowY - dy[dir];
                } else if (c == 'L') {
                    if (dir == 0) {
                        dir = 3;
                    } else {
                        dir--;
                    }
                } else if (c == 'R') {
                    if (dir == 3) {
                        dir = 0;
                    } else {
                        dir++;
                    }
                }
                minX = Math.min(minX, nowX);
                minY = Math.min(minY, nowY);
                maxX = Math.max(maxX, nowX);
                maxY = Math.max(maxY, nowY);
            }
            sb.append((Math.abs(minX) + Math.abs(maxX)) * (Math.abs(minY) + Math.abs(maxY)) + "\n");
        }
        System.out.println(sb);
    }
}
