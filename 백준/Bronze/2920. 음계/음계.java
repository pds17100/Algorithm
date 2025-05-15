
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isAsc = true;
        boolean isDes = true;

        for (int i = 0; i < 7; i++) {
            if (arr[i] > arr[i + 1]) {
                isAsc = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDes = false;
            }
        }

        if (isAsc) {
            System.out.println("ascending");
        } else if (isDes) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
