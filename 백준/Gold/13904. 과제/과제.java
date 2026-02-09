
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Subject subject[] = new Subject[N];
        int maxDay = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            subject[i] = new Subject(d, w);
            maxDay = Math.max(maxDay, d);
        }

        //마감일 내림차순
        Arrays.sort(subject, (a, b) -> b.day - a.day);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int idx = 0;
        int totalScore = 0;

        // 마감일이 긴 날부터 1일까지 역순으로 처리
        for (int day = maxDay; day > 0; day--) {
            // 현재 날짜에 할 수 있는 과제들을 모두 우선순위 큐에 추가
            while (idx < N && subject[idx].day >= day) {
                pq.offer(subject[idx].jumsu);
                idx++;
            }

            // 우선순위 큐에서 가장 점수가 높은 과제 선택
            if (!pq.isEmpty()) {
                totalScore += pq.poll();
            }
        }

        System.out.println(totalScore);
    }

    static class Subject implements Comparable<Subject>{
        int day;
        int jumsu;

        public Subject(int day, int jumsu) {
            this.day = day;
            this.jumsu = jumsu;
        }

        //점수 내림차순
        @Override
        public int compareTo(Subject o) {
            return o.jumsu - this.jumsu;
        }

    }

}
