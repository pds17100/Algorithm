
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int arr[][];
    static int arriveX, arriveY;
    static int startY;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int caseNum = Integer.parseInt(br.readLine());
            arr = new int[100][100];
            arriveX = 0;
            arriveY = 0;
            startY = 0;
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if (arr[i][j] == 2) {
                        arriveX = i;
                        arriveY = j;
                    }
                }
            }
            trace(arriveX, arriveY);
            sb.append("#").append(t).append(" ").append(startY).append("\n");

        }
        System.out.println(sb);
    }

    private static void trace(int x, int y) {
        while (x > 0) {
            if (y > 0 && arr[x][y - 1] == 1) {
                while (y > 0 && arr[x][y - 1] == 1) {
                    y--;
                }
            } else if (y < 99 && arr[x][y + 1] == 1) {
                while (y < 99 && arr[x][y + 1] == 1) {
                    y++;
                }
            }
            x--;
        }
        startY = y;
    }
}
