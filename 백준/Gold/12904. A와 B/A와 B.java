
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        while (T.length()>S.length()) {
            if (T.charAt(T.length() - 1) == 'A') {
                T = T.substring(0, T.length() - 1);
            } else {
                T = new StringBuilder(T.substring(0, T.length() - 1)).reverse().toString();
            }
        }
        System.out.println(T.equals(S) ? 1 : 0);
    }
}
