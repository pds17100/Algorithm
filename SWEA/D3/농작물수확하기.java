package D3;

import java.util.Scanner;

public class 농작물수확하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int arr[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String str = scan.next();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j) - '0'; //문자를정수로형변환
                }
            }
            int result = 0;
            int start = N/2;
            int end = N/2;
            for (int i = 0; i < N; i++) {
                for (int j = start; j <= end; j++) {
                    result += arr[i][j];
                }
                if (i < N / 2) { //행의절반전이면
                    start -=1;
                    end +=1;
                } else { //행의절반후면
                    start +=1;
                    end -=1;
                }
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
