
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, 1);
            } else {
                hashMap.replace(str, hashMap.get(str)+1);
            }
        }
        int max = 0;
        for (String key : hashMap.keySet()) {
            max = Math.max(max,hashMap.get(key));
        }
        ArrayList<String> al = new ArrayList<>(hashMap.keySet());
        Collections.sort(al);
        for (String a : al) {
            if (hashMap.get(a) == max) {
                System.out.println(a);
                break;
            }
        }
    }
}
