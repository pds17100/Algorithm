package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String str = "";
            for (int i = 1; i <= 9; i++) {
                if (N % i == 0 && N / i <= 9) {
                    str = "Yes";
                    break;
                } else {
                    str = "No";
                }
            }
            sb.append("#" + t + " " + str + "\n");
        }
        System.out.println(sb);
    }
}
