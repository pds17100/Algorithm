
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String enter = br.readLine();
        HashMap<String, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < N-1; i++) {
            String name = br.readLine();
            if (!name.equals(enter) && !map.containsKey(name)) {
                map.put(name, 1);
                result++;
            } else if (name.equals(enter)) {
                map.clear();
            }
        }
        System.out.println(result);
    }
}
