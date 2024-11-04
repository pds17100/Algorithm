package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색2 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    static int result[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        A = new ArrayList[N + 1];
        result = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A[start].add(end);
            A[end].add(start);
        }
        for (int i = 1; i < N + 1; i++) {
            Collections.sort(A[i], Collections.reverseOrder());
        }
        BFS(R);
        for (int i = 1; i < N + 1; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void BFS(int R) {
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(R);
        visited[R] = true;
        result[R] = cnt++;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int i : A[cur]) {
                if (!visited[i]) {
                    visited[i] = true;
                    result[i] = cnt++;
                    queue.offer(i);
                }
            }
        }
    }
}
