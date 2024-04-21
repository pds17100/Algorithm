package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 몫과나머지출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int mok = 0;
        int na = 0;
        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
             mok = a/b;
             na = a%b;
            System.out.println("#" + t + " " + sb.append(mok).append(" ").append(na));
        }
    }
}
