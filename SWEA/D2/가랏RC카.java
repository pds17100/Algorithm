package D2;

import java.util.Scanner;

public class 가랏RC카 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int state = scan.nextInt();
            int speed = 0;
            if (state == 1) {
                speed = scan.nextInt();
            } else if (state == 2) {
                speed = scan.nextInt();
                speed = 0;
            }
            int total = speed;
            for (int i = 1; i < N; i++) {
                state = scan.nextInt();
                if (state == 0) {
                } else if (state == 1) {
                    int s = scan.nextInt();
                    speed = s + speed;
                } else if(state == 2) {
                    int s = scan.nextInt();
                    speed = speed - s;
                    if ((speed) < 0) {
                        speed = 0;
                    }
                }
                total = total + speed;
            }
            System.out.println("#" + t + " " + total);
        }
    }
}
