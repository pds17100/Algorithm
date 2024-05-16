package D3;

import java.util.Scanner;

public class 팔씨름 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            String str = scan.next();
            int win = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'o') {
                    win++;
                }
            }
            int k = 15 - str.length();
            String result = "";
            if (win + k >= 8) {
                result = "YES";
            } else {
                result = "NO";
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
