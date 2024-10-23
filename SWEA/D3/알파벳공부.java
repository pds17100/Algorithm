package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳공부 {
    static char alpabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            char arr[] = new char[str.length()];
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i);
                if (arr[i] == alpabet[i]) {
                    cnt++;
                } else {
                    break;
                }
            }
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb);
    }
}
