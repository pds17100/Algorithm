package 전체문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        if (N < 100) {
            cnt = N;
        } else {
            cnt = 99;
            for (int i = 100; i <= N; i++) {
                int A = i/100;
                int B = (i/10) % 10;
                int C = i % 10;
                if (A - B == B - C) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
