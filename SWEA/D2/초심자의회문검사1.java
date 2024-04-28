package D2;

import java.util.Scanner;

public class 초심자의회문검사1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            String str = scan.next();
            int result =1;
            for (int i = 0; i < str.length() / 2 + 1; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    result = 0;
                    break;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
