
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int result = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                result += N / 5;
                System.out.println(result);
                return;
            } else {
                N -= 3;
                result++;
            }
            if (N < 0) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(result);
    }
}
