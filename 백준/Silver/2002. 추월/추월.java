import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            hashMap.put(br.readLine(), i);
        }

        int outCar[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            String car = br.readLine();
            outCar[i] = hashMap.get(car);
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (outCar[i] > outCar[j]) {
                    result++;
                    break;
                }
            }
        }

        System.out.println(result);

    }
}
