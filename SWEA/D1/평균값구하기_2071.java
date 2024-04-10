package D1;

import java.util.Scanner;

public class 평균값구하기_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            float sum = 0;
            for(int i = 0; i < 10; i++) {
                sum += sc.nextInt();
            }
            System.out.print("#" + test_case + " " + Math.round(sum/10));
            System.out.println();
        }
    }
}

