package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 초심자의회문검사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            int result = 0;
            for (int i = 0; i < 1; i++) {
                if (str.length() == 10) {
                    if (str.charAt(i) == str.charAt(str.length() - 1) && str.charAt(i + 1) == str.charAt(str.length() - 2)
                            && str.charAt(i + 2) == str.charAt(str.length() - 3) && str.charAt(i + 3) == str.charAt(str.length() - 4)
                    && str.charAt(i+4) == str.charAt(str.length() - 5)) {
                        result = 1;
                        break;
                    }
                } else if (str.length() > 8 && str.length() < 10) {
                    if (str.charAt(i) == str.charAt(str.length() - 1) && str.charAt(i + 1) == str.charAt(str.length() - 2)
                            && str.charAt(i + 2) == str.charAt(str.length() - 3) && str.charAt(i + 3) == str.charAt(str.length() - 4)) {
                        result = 1;
                        break;
                    }
                } else if (str.length() > 5 && str.length() < 8) {
                    if (str.charAt(i) == str.charAt(str.length() - 1) && str.charAt(i + 1) == str.charAt(str.length() - 2)
                    && str.charAt(i + 2) == str.charAt(str.length() - 3)) {
                        result = 1;
                        break;
                    }
                } else if (str.length() > 3 && str.length() < 6) {
                    if (str.charAt(i) == str.charAt(str.length() - 1) && str.charAt(i + 1) == str.charAt(str.length() - 2)) {
                        result = 1;
                        break;
                    }
                } else if (str.length() == 3) {
                    if (str.charAt(i) == str.charAt(str.length() - 1)) {
                        result = 1;
                        break;
                    }
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
