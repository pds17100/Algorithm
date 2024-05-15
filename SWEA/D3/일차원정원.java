package D3;

import java.util.Scanner;

public class 일차원정원 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int D = scan.nextInt();
            int result = 0;
//            int result = (int) Math.ceil(N/(double)((2*D)+1));
            if (N % (2 * D + 1) == 0) {
                result = N/((2*D)+1);
            } else {
                result = N/((2*D)+1)+1;
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
