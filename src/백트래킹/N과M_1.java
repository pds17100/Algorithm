package 백트래킹;

import java.util.Scanner;

public class N과M_1 {
    public static int arr[];
    public static boolean visit[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        //4 2   3 1
        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }
    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}
