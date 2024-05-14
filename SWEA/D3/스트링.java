package D3;

import java.util.Scanner;

public class 스트링 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            scan.nextInt();
            String str = scan.next();
            String sentance = scan.next();
            int count = 0;
            for (int i = 0; i <= sentance.length()-str.length(); i++) {
                if (str.equals(sentance.substring(i, i + str.length()))) {
                    count++;
                }
            }
            System.out.println("#" + t + " " + count);
        }
    }
}
