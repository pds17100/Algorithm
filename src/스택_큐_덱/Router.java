package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Router {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0 && q.size()<N) {
                q.add(num);
            } else if (num == 0 && !q.isEmpty()) {
                q.poll();
            } else if (num == -1) {
                if (q.isEmpty()) {
                    System.out.println("empty");
                    break;
                }
                for (Integer i : q) {
                    System.out.print(i + " ");
                }
                break;
            }
        }
    }
}
