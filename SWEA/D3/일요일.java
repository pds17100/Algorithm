package D3;

import java.util.Scanner;

public class 일요일 {
    public static void main(String[] args) {
        String str[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            String day = scan.next();
            int result = 0;
            for (int i = 0; i < str.length; i++) {
                if (day.equals(str[i])) {
                    result = 7 - i;
                    break;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
