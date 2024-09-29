package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            int arr[] = new int[N];
            Deque<Integer> q = new LinkedList<>();

            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[j] = temp; //우선순위
                q.add(j); //0 1 2 3
            }
            int cnt = 0;
            while (!q.isEmpty()) {
                boolean check = false;
                int before = q.poll();
                for (int j : arr) {
                    if (arr[before] < j) {
                        q.add(before);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    cnt++;
                    arr[before] = 0;
                    if (before == M) {
                        System.out.println(cnt);
                        break;
                    }
                }
            }
        }
    }
}
