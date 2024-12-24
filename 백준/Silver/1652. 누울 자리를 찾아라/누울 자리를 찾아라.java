
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == '.') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int row = 0;
        int col = 0;

        //가로
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j]) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        row++;
                    }
                    cnt = 0;
                }
            }
            if (cnt > 1) {
                row++;
            }
        }

        //세로
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i]) {
                    cnt++;
                } else {
                    if (cnt > 1) {
                        col++;
                    }
                    cnt = 0;
                }
            }
            if (cnt > 1) {
                col++;
            }
        }
        System.out.println(row + " " + col);
    }
}
