package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 명령프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str[] = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }
        int len = str[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean b = true;
            char c = str[0].charAt(i);
            for (int j = 1; j < N; j++) {
                if (c != str[j].charAt(i)) {
                    b = false;
                }
            }
            if (b) {
                sb.append(c);
            } else {
                sb.append('?');
            }
        }
        System.out.println(sb);
    }
}
