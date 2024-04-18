package D2;

import java.util.Base64;
import java.util.Scanner;

public class Base64Decoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 1; i <= T; i++) {
            String str = scan.next();
            String result = new String(Base64.getDecoder().decode(str));
            System.out.println("#" + i + " " + result);
        }
    }
}
