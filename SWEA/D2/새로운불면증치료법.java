package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 새로운불면증치료법 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String s = br.readLine();
            int N = Integer.parseInt(s);
            boolean check[] = new boolean[10];
            int count = 0;
            int x = 1;
            while (true) {
                for (int i = 0; i < s.length(); i++) {
                    int tmp = Integer.parseInt(s.substring(i, i+1));
                    if (check[tmp] == false) {
                        count++;
                        check[tmp] = true;
                    }
                }
                if (count == 10) break;

                x++;
                s = Integer.toString(N * x);
            }
            System.out.println("#" + t + " " + s);
        }
    }
}
