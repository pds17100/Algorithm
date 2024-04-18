package D1;

import java.util.Scanner;

public class 거꾸로출력해보아요 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = N; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
