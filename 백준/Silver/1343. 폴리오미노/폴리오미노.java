
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        result = poli(str);
        System.out.println(result);
    }

    private static String poli(String s) {
        String ans = "";
        String A = "AAAA";
        String B = "BB";
        s = s.replaceAll("XXXX", A);
        s = s.replaceAll("XX", B);
        if (s.contains("X")) {
            return "-1";
        }
        return s;
    }
}
