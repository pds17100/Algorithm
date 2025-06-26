
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> inCar = new LinkedList<>();
        Queue<String> outCar = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            inCar.offer(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            outCar.offer(br.readLine());
        }

        int result = 0;
        while (!outCar.isEmpty()) {
            String out = outCar.poll();
            if (!inCar.peek().equals(out)) {
                result++;
                inCar.remove(out);
            } else {
                inCar.poll();
            }
        }

        System.out.println(result);
    }
}
