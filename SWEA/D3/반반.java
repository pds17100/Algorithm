package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 반반 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        HashSet<Character> set = new HashSet<>();
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (!set.contains(str.charAt(i))) {
                    set.add(str.charAt(i));
                }
            }
            if (set.size() == 2) {
                result = "Yes";
            }else {
                result = "No";
            }
            sb.append("#" + t + " " + result + "\n");
            set.clear();
        }
        System.out.println(sb);
    }
}
