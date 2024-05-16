package D3;

import java.util.Scanner;

public class 직사각형길이찾기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int result = a;
            if (a == b ) {
                result = c;
            } else if (a == c) {
                result = b;
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
