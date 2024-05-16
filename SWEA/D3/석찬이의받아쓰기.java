package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 석찬이의받아쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String str2 = br.readLine();
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str2.charAt(i)) {
                    result++;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
