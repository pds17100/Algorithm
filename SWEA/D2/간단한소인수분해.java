package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            while (N % 2 == 0) {
                N/=2;
                a++;
            }
            while (N % 3 == 0) {
                N/=3;
                b++;
            }
            while (N % 5 == 0) {
                N/=5;
                c++;
            }
            while (N % 7 == 0) {
                N/=7;
                d++;
            }
            while (N % 11 == 0) {
                N/=11;
                e++;
            }
            System.out.println("#" + t + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
