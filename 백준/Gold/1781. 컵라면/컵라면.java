
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Ramen ramen[] = new Ramen[N];
        for (int i = 0; i < ramen.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ramen[i] = new Ramen(a, b);
        }

        Arrays.sort(ramen, new Comparator<Ramen>() {
            @Override
            public int compare(Ramen o1, Ramen o2) {
                if (o1.deadLine < o2.deadLine) {
                    return 1;
                } else if (o1.deadLine == o2.deadLine) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        PriorityQueue<Ramen> pq = new PriorityQueue<>();

        int cnt = 0;
        int sum = 0;
        for (int i = 200000; i >= 1; i--) {
            while (cnt < ramen.length && ramen[cnt].deadLine == i) {
                pq.add(ramen[cnt++]);
            }

            if (pq.isEmpty()) continue;

            sum += pq.poll().ramen;
        }

        System.out.println(sum);


    }

    static class Ramen implements Comparable<Ramen> {
        int deadLine;
        int ramen;

        public Ramen(int deadLine, int ramen) {
            this.deadLine = deadLine;
            this.ramen = ramen;
        }

        @Override
        public int compareTo(Ramen o) {
            if(this.ramen<o.ramen)
                return 1;
            else if(this.ramen==o.ramen) {
                if(this.deadLine>o.deadLine)
                    return 1;
                else if(this.deadLine==o.deadLine)
                    return 0;
            }
            return -1;
        }

    }


}
