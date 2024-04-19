package D1;

import java.util.Scanner;

public class 더블더블 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = 1;
        for (int i = 0; i <= N; i++) {
            System.out.print(a + " ");
            a*=2;
        }
    }
}
