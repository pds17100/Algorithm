
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int count = 0;
            for(int i=-N; i<=N; i++) {
                for (int j = -N; j <= N; j++) {
                    if (i * i + j * j <= N * N) {
                        count++;
                    }
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }
}
