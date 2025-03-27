import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    static int N;   //노드의개수
    static int[] parent;    //부모노드저장
    static boolean[] isVisit;   //방문여부확인
    static StringTokenizer st;
    static ArrayList<Integer> list[];   //노드저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N+1];
        parent = new int[N+1];
        isVisit = new boolean[N+1];

        for(int i=0; i<N+1; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++) {  //연결된노드값들을입력받는다
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        dfs(1); //트리의루트는1

        for(int i=2; i<parent.length; i++) {    //결과값출력
            System.out.println(parent[i]);
        }
    }
    public static void dfs(int index) {
        isVisit[index] = true;
        for(int i: list[index]) {
            if(!isVisit[i]) {
                parent[i] = index;  //parent list에각노드들의부모값을저장해준다
                dfs(i);
            }
        }
    }
}
