package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        System.out.println();
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int jumsu[] = new int[101];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 1000; j++) {
                jumsu[Integer.parseInt(st.nextToken())]++;
            }
            int max = 0;
            int idx = 0;
            for (int k = 0; k <= 100; k++) {
                if (jumsu[k] >= max) {
                    max = jumsu[k];
                    idx = k;
                }
            }
            System.out.print("#" + N + " " + idx);
            System.out.println();
        }
    }
}
