package D1;

import java.util.Scanner;

public class 연월일달력_2056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i <= T; i++) {
            String s = scan.next();
            int month = Integer.parseInt(s.substring(4, 6));
            int day = Integer.parseInt(s.substring(6, 8));
            String result = "-1";
            if (1 <= month && month <= 12 && 1 <= day && day <= days[month - 1]) {
                result = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
