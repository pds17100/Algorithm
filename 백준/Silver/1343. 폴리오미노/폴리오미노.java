
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String res = "";
        res = poliomino(s);
        System.out.println(res);
    }

    private static String poliomino(String s) {
        String ans = "";
        String A = "AAAA";
        String B = "BB";
        s = s.replaceAll("XXXX", A);
        ans = s.replaceAll("XX", B);

        if (ans.contains("X")) {
            ans = "-1";
        }
        return ans;
    }
}
