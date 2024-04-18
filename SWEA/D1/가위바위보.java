package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class 가위바위보 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if (A > B) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        br.close();
//        Scanner scan = new Scanner(System.in);
//        int A = scan.nextInt();
//        int B = scan.nextInt();
//        if (A > B) {
//            System.out.println("A");
//        } else {
//            System.out.println("B");
//        }
    }
}
