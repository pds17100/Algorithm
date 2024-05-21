package 일반수학1;

import java.util.Scanner;

public class 세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int C = scan.nextInt();
            int q = C / 25;
            C %= 25;
            int d = C / 10;
            C %= 10;
            int n = C / 5;
            C %= 5;
            int p = C;
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        scan.close();
    }

}
