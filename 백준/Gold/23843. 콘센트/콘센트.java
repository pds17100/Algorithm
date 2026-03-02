
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer electronics[] = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            electronics[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(electronics, Collections.reverseOrder());

        int time = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            if (pq.size() >= M) {
                time = pq.poll();
            }

            pq.offer(time + electronics[i]);
        }

        while (!pq.isEmpty()) {
            time = pq.poll();
        }

        System.out.println(time);

    }
}
