
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N + 1];
            int sum = 0;
            int maxVotes = 0;
            int winner = 0;
            boolean isDuplicate = false;
            for (int i = 1; i <= N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];

                if (arr[i] > maxVotes) {
                    maxVotes = arr[i];
                    winner = i;
                    isDuplicate = false;
                } else if (arr[i] == maxVotes) {
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                System.out.println("no winner");
            } else {
                if (maxVotes > sum / 2) {
                    System.out.println("majority winner " + winner);
                } else {
                    System.out.println("minority winner " + winner);
                }
            }
        }
    }
}
