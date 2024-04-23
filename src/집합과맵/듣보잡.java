package 집합과맵;

import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int sum = 0;
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            hashSet.add(scan.next());
        }
        for (int i = 0; i < M; i++) {
            String str = scan.next();
            if (hashSet.contains(str)) {
                arrayList.add(str);
                sum++;
            }
        }
        Collections.sort(arrayList);
        System.out.println(sum);
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
