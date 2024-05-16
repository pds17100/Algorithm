package D3;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            Stack<Integer> stack = new Stack<>();
            int K = scan.nextInt();
            for (int i = 0; i < K; i++) {
                int tmp = scan.nextInt();
                if (tmp == 0) {
                    stack.pop();
                }else {
                    stack.add(tmp);
                }
            }
            int result = 0;
            for (int i : stack) {
                result += i;
            }
            System.out.println("#" + t + " " + result);
        }
    }
}
