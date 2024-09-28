package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 트럭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Integer> trucks = new LinkedList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            trucks.add(Integer.parseInt(st.nextToken()));
        }

        Deque<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.add(0);
        }
        int time = 0;
        int weightOnBridge = 0;

        while (!bridge.isEmpty()) {
            time++;
            weightOnBridge -= bridge.poll();

            if (!trucks.isEmpty()) {
                if (trucks.peek() + weightOnBridge <= L) {
                    weightOnBridge += trucks.peek();
                    bridge.add(trucks.poll());
                } else {
                    bridge.add(0);
                }
            }
        }
        System.out.println(time);
    }
}
