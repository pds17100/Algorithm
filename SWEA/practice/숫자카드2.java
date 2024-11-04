package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int arrN[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(upper(arrN, key) - lower(arrN, key)).append(" ");
        }
        System.out.println(sb);
    }

    private static int upper(int arrN[], int key) {
        int lo = 0;
        int hi = arrN.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (key < arrN[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static int lower(int arrN[], int key) {
        int lo = 0;
        int hi = arrN.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (key <= arrN[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
