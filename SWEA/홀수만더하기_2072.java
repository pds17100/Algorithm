import java.util.Scanner;
import java.util.StringTokenizer;

public class 홀수만더하기_2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                StringTokenizer st = new StringTokenizer(sc.next());
                int N = Integer.parseInt(st.nextToken());
                if (N % 2 == 1) {
                    sum += N;
                }
            }
            System.out.print("#" + test_case + " " + sum + "\n");
        }
    }
}
