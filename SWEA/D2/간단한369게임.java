package D2;

import java.util.Scanner;

/**
 * String.valueOf(); //문자열 변환
 * str.contains("3") //문자열 포함 여부 확인하기
 */
public class 간단한369게임 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=N; i++) {
            String str = String.valueOf(i);
            if (str.contains("3") || str.contains("6") || str.contains("9")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) % 3 == 0 && str.charAt(j) != '0') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
