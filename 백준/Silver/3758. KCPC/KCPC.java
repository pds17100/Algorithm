
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Team {
        int id;         // 팀 번호
        int total;      // 총점
        int submitCnt;  // 제출 횟수
        int lastTime;   // 마지막 제출 시간

        public Team(int id) {
            this.id = id;
            this.total = 0;
            this.submitCnt = 0;
            this.lastTime = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 팀의 수
            int k = Integer.parseInt(st.nextToken()); // 문제의 수
            int t = Integer.parseInt(st.nextToken()); // 우리 팀 id
            int m = Integer.parseInt(st.nextToken()); // 로그의 수

            int[][] score = new int[n + 1][k + 1];
            Team[] teams = new Team[n + 1];

            for (int i = 1; i <= n; i++) {
                teams[i] = new Team(i);
            }

            for (int time = 1; time <= m; time++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int problemNum = Integer.parseInt(st.nextToken());
                int jumsu = Integer.parseInt(st.nextToken());

                score[id][problemNum] = Math.max(score[id][problemNum], jumsu);
                teams[id].submitCnt++;
                teams[id].lastTime = time;
            }

            // 각 팀 총점 계산
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += score[i][j];
                }
                teams[i].total = sum;
            }

            // 0번은 안 쓰니까 1~n만 복사해서 정렬
            Team[] rank = new Team[n];
            for (int i = 1; i <= n; i++) {
                rank[i - 1] = teams[i];
            }

            Arrays.sort(rank, (a, b) -> {
                if (a.total != b.total) {
                    return b.total - a.total; // 총점 내림차순
                }
                if (a.submitCnt != b.submitCnt) {
                    return a.submitCnt - b.submitCnt; // 제출 횟수 오름차순
                }
                return a.lastTime - b.lastTime; // 마지막 제출 시간 오름차순
            });

            // 우리 팀 순위 찾기
            for (int i = 0; i < n; i++) {
                if (rank[i].id == t) {
                    sb.append(i + 1).append('\n');
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}