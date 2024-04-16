package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * HashMap
 */
public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            hashMap.put(br.readLine(), 0);
        }
        for (int i = 0; i < M; i++) {
            if (hashMap.get(br.readLine()) != null) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
