
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 최소거리의 최대거리 구하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        int C = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int lo = 1; //가능한최소간격
        int hi = arr[N-1];
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int position = 0; //공유기설치위치
            int cnt = 1;
            for (int i = 1; i < N; i++) {
                if (arr[i] - arr[position] >= mid) {
                    position = i;
                    cnt++;
                }
            }
            if (cnt < C) {
                hi = mid - 1;
                continue;
            }
            lo = mid + 1;
        }
        System.out.println(lo - 1);
    }
}
