
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> orderList = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            if (!orderList.contains(num)) {
                orderList.add(num);
            }
        }

        List<Integer> list = new ArrayList<>(hashMap.keySet());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freqCompare = hashMap.get(o2) - hashMap.get(o1);
                if (freqCompare == 0) {
                    return orderList.indexOf(o1) - orderList.indexOf(o2);
                }
                return freqCompare;
            }
        });

        for (Integer key : list) {
            for (int i = 0; i < hashMap.get(key); i++) {
                sb.append(key).append(" ");
            }
        }

        System.out.println(sb);
    }
}
