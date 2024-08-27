package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        solve(str);
    }

    static void solve(String str) {
        int zero = 0;
        int one = 0;
        if (str.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (str.charAt(i) == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
