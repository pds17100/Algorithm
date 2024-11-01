package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색1 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    static int result[];
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
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
        if (!visited[R]) {
            DFS(R);
        }
        for (int i = 1; i < N + 1; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }

    private static void DFS(int R) {
        if (visited[R]) {
            return;
        }
        visited[R] = true;
        result[R] = cnt++;
        Collections.sort(A[R]);
        for (Integer i : A[R]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
