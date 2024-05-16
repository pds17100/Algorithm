package D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 코딩토너먼트 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int K = scan.nextInt();
            Queue<Integer> q = new LinkedList<>();
            int total = (int) Math.pow(2, K);
            for (int i = 0; i < total; i++) {
                q.add(scan.nextInt());
            }
            int result = 0;
            while (q.size() >= 2) {
                int a = q.poll();
                int b = q.poll();
                q.add(Math.max(a, b));
                result += Math.abs(a - b);
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
