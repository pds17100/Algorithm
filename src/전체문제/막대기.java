package 전체문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int temp = 0;
        int cnt = 0;
        int result = X;

        while (true) {
            if (X == 64) {
                cnt++;
                break;
            }
            stick /= 2;
            if (stick <= X) {
                temp += stick;
                cnt++;
                if (result == temp) {
                    break;
                }
                X -= stick;
            }
        }
        System.out.println(cnt);
    }
}
