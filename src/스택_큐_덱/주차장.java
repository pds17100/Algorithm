package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 주차장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int curParking[] = new int[N + 1];

        int price[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }
        int weight[] = new int[M+1];
        for (int i = 1; i <= M; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }

        int sequence = M * 2;
        Deque<Integer> q = new LinkedList<>();
        int result = 0;
        outer : for (int i = 1; i <= sequence; i++) {
            int car = Integer.parseInt(br.readLine());
            if (car > 0) {  //들어오는 차
                for (int j = 1; j < N + 1; j++) {
                    if (curParking[j] == 0) {
                        curParking[j] = car;
                        continue outer;
                    }
                }
                q.add(car);
            } else {    //나가는 차
                for (int j = 1; j < N+1; j++) {
                    if (curParking[j] == car * (-1)) {
                        curParking[j] = 0;
                        result += price[j] * weight[car * (-1)];
                        if (!q.isEmpty()) {
                            curParking[j] = q.poll();
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
