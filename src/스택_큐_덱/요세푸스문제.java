package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 1부터 N을 queue로 나열 -> k번째까지 q.offer(q.poll())하고출력
 */
public class 요세푸스문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        sb.append("<");
        while (q.size() > 1) {
            for (int i = 0; i < k-1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll() + ", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
