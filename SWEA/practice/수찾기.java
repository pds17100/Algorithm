package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arrN[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        int M = Integer.parseInt(br.readLine());
        int arrM[] = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
            int key = arrM[i];
            binarySearch(arrN, key);
        }
        System.out.println(sb);
    }

    private static void binarySearch(int[] arrN, int key) {
        int lo = 0;
        int hi = arrN.length - 1;
        int mid;
        boolean find = false;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arrN[mid] > key) {
                hi = mid - 1;
            } else if (arrN[mid] < key) {
                lo = mid + 1;
            } else {
                find = true;
                break;
            }
        }
        if (find) {
            sb.append("1").append("\n");
        } else {
            sb.append("0").append("\n");
        }
    }
}
