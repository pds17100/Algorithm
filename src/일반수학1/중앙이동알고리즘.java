package 일반수학1;

import java.util.Scanner;

public class 중앙이동알고리즘 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println((int)Math.pow((Math.pow(2,N)+1),2));
    }
}
