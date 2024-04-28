package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 패턴마디의길이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            int length = 0;
            for (int i = 1; i <= 10; i++) {
                if (str.charAt(0) == str.charAt(i) && str.charAt(1) == str.charAt(i+1)) {
                    length = i;
                    break;
                }
            }
            System.out.println("#" + t + " " + length);
        }
        br.close();
    }
}
