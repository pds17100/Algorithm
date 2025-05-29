
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        char arr[][] = new char[H][W];
        int ans[][] = new int[H][W];
        for (int i = 0; i < H; i++) {
            String str = br.readLine();
            for (int j = 0; j < W; j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == 'c') {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W - 1; j++) {
                if (ans[i][j] != -1 && ans[i][j + 1] != 0) {
                    ans[i][j + 1] = ans[i][j] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                sb.append(ans[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
