
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int hour = 24 * N;

        int[] a = new int[M];
        int[] b = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // gain 높은 순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                int xGain = Math.min(x[0] + x[1], 100) - x[0];
                int yGain = Math.min(y[0] + y[1], 100) - y[0];
                return yGain - xGain; // 내림차순
            }
        });

        for (int i = 0; i < M; i++) {
            pq.offer(new int[]{a[i], b[i]});
        }

        while (hour > 0 && !pq.isEmpty()) {
            int[] node = pq.poll();
            int gain = Math.min(node[0] + node[1], 100) - node[0];

            if (gain == 0) {
                pq.offer(node);
                break; // 모든 과목 100점
            }

            node[0] += gain;
            hour--;
            pq.offer(node);
        }

        long result = 0;
        for (int[] node : pq) {
            result += node[0];
        }

        System.out.println(result);
    }
}