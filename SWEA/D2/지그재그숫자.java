package D2;

import java.util.Scanner;

public class 지그재그숫자 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = scan.nextInt();
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 0) {
                    sum -= j;
                } else {
                    sum += j;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
