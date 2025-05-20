
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    static ArrayList<Integer> A[];
    static boolean visited[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken());

            A = new ArrayList[101];
            visited = new boolean[101];
            for (int i = 1; i <= 100; i++) {
                A[i] = new ArrayList<>();
            }

            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N / 2; i++) {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                A[s].add(e);
            }

            int result = bfs(start);
            sb.append("#").append(t).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    private static int bfs(int start) {
        Queue<Point> q = new LinkedList<>();
        visited[start] = true;
        q.offer(new Point(start, 0));

        int maxDepth = 0;
        int maxNum = start;


        while (!q.isEmpty()) {
            Point p = q.poll();
            if (p.depth > maxDepth) {
                maxDepth = p.depth;
                maxNum = p.num;
            } else if (p.depth == maxDepth) {
                maxNum = Math.max(p.num, maxNum);
            }

            for (int i : A[p.num]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(new Point(i, p.depth + 1));
                }
            }
        }
        return maxNum;
    }


    static class Point {
        int num;
        int depth;
        Point(int num, int depth) {
            this.num = num;
            this.depth = depth;
        }
    }

}
