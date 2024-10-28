package practice;

import java.util.Scanner;

public class 숫자의합구하기2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        int sum = 0;
//        str.toCharArray();
        for (int i = 0; i < num; i++) {
            sum += str.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
