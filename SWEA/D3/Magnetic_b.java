package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magnetic_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int N = Integer.parseInt(br.readLine());
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                int last = 0;
                for (int j = 0; j < N; j++) {
                    if (arr[j][i] == 1) {
                        last = 1;
                    } else if (arr[j][i] == 2) {
                        if (last == 1) {
                            count++;
                        }
                        last = 2;
                    }
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }
}
