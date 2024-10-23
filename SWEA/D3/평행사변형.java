package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평행사변형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int width = 0;
            int N = Integer.parseInt(br.readLine());
            width = N * N;
            sb.append("#" + t + " " + width + "\n");
        }
        System.out.println(sb);
    }
}
