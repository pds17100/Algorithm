package 약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            if (N == -1) {
                break;
            }
            sb.append(N + " = 1");
            int sum = 1;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }
            if (N == sum) {
                System.out.println(sb);
            }
            else {
                System.out.println(N + " is NOT perfect.");
            }
        }
        br.close();
    }
}
