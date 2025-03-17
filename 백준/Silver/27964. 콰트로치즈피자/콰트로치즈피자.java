import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String cheese = "Cheese";

        HashSet<String> hashSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            String str = st.nextToken();
            int len = str.length() - 6;
            if (len >= 0) {
                String a = "";
                for (int j = len; j < str.length(); j++) {
                    a += str.charAt(j);
                }
                if (a.equals(cheese)) {
                    hashSet.add(str);
                }
            }
        }

        if (hashSet.size() >= 4) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}
