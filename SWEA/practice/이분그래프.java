package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 이분그래프 {
    static ArrayList<Integer> A[];
    static boolean visited[];
    static boolean IsEven;
    static int check[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int t = 1; t <= K; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;
            for (int i = 1; i <= V; i++) {
                A[i] = new ArrayList<Integer>();
            }
            //에지 데이터 저장하기
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                A[start].add(end);
                A[end].add(start);
            }
            //모든 노드에서 DFS 실행 해야함
            for (int i = 1; i <= V; i++) {
                if (IsEven) {
                    DFS(i);
                } else {
                    break;
                }
            }
            if(IsEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) {    //인접리스트로 받아서 start에서 연결된 모든 노드를 탐색하게 된다.
            if (!visited[i]) {
                //바로 직전에 있는 노드와 다른 집합으로 분류를 해주는것이 필요
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            } else if (check[start] == check[i]) {
                    IsEven = false;
                }
        }
    }
}
