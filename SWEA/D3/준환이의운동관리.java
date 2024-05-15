package D3;

import java.util.Scanner;

public class 준환이의운동관리 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t=1; t<=T; t++) {
            int L = scan.nextInt();
            int U = scan.nextInt();
            int X = scan.nextInt();
            int result = 0;
            if(X > U) {
                result = -1;
            } else if(X < L) {
                result = L-X;
            } else if(X >= U && X <= L) {
                result = 0;
            }
            System.out.println("#" + t + " " + result);
        }
    }

}
