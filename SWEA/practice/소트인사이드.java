package practice;

import java.util.Scanner;

public class 소트인사이드 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int N[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            N[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i+1; j < str.length(); j++) {
                if (N[j] > N[max]) {
                    max = j;
                }
            }
            if (N[i] < N[max]) {
                int temp = N[i];
                N[i] = N[max];
                N[max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(N[i]);
        }
    }
}
