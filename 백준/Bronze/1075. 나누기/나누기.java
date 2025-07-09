
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int F = scan.nextInt();

        N -= (N % 100);

        while (true) {
            if (N % F == 0) {
                break;
            }
            N++;
        }

        System.out.format("%02d", (N % 100));
        }
}
