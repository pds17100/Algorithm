package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모음의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag = true) {
            int cnt = 0;
            String str = br.readLine();
            str = str.toLowerCase();
            if (str.equals("#")) {
                flag = false;
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
