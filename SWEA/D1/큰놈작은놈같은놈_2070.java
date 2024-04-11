package D1;

import java.util.Scanner;

public class 큰놈작은놈같은놈_2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.print("#" + test_case + " ");
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else if (A == B) {
                System.out.println("=");
            }
        }
    }
}
