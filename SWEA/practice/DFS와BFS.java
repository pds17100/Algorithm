package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와BFS {
    static boolean visited[];
    static ArrayList<Integer> A[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
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
            Collections.sort(A[i]);
        }
        DFS(V);
        sb.append("\n");
        for (int i = 1; i < N + 1; i++) {
            visited[i] = false;
        }
        BFS(V);
        System.out.println(sb);
    }

    private static void BFS(int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            sb.append(node).append(" ");
            for (int i : A[node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int V) {
        visited[V] = true;
        sb.append(V).append(" ");
        for (int i : A[V]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
