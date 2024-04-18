package D1;

import java.util.Scanner;

public class 아주간단한계산기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        Calculater(A,B);

    }
    static void Calculater(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
