package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j < N-1; j++) {
                if ((arr[j - 1] < arr[j] && arr[j] < arr[j + 1]) || (arr[j - 1] > arr[j] && arr[j] > arr[j + 1])) {
                    cnt++;
                }
            }
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb);
    }
}
