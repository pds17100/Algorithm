
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int N, M, S;
    static ArrayList<Integer> list[];
    static boolean visited[];
    static boolean escape = false;
    static HashSet<Integer> fans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        fans = new HashSet<>();

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
        }

        S = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < S; i++) {
            fans.add(Integer.parseInt(st.nextToken()));
        }

        if (fans.contains(1)) {
            System.out.println("Yes");
            return;
        }

        dfs(1);

        if (escape) {
            System.out.println("yes");
        } else {
            System.out.println("Yes");
        }

    }

    private static void dfs(int V) {
            visited[V] = true;

        if (list[V].isEmpty()) {
            escape = true;
            return;
        }

        for (int i : list[V]) {
            if (fans.contains(i)) {
                continue;
            }
            if (!visited[i]) {
                dfs(i);
            }
        }

    }

}
