package D2;

import java.util.Arrays;
import java.util.Scanner;

public class 조교의성적매기기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rank[] = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            double arr[] = new double[N];
            for (int i = 0; i < N; i++) {
                int A = scan.nextInt();
                int B = scan.nextInt();
                int C = scan.nextInt();
                arr[i] = ((A*0.35) + (B*0.45) + (C*0.20))/10;
            }
            String ans = "";
            double goal = arr[K - 1];
            Arrays.sort(arr);
            for (int i = 0; i < N; i++) {
                if (goal == arr[i]) {
                    ans = rank[i/(N/10)];
                    break;
                }
            }
            System.out.println("#" + t + " " + ans);
            }
        }
    }

