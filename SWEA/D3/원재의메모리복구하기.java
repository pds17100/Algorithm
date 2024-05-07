package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 원재의메모리복구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        char bit = '0';
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (bit != str.charAt(i)) {
                    bit = str.charAt(i);
                    count++;
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }
}
