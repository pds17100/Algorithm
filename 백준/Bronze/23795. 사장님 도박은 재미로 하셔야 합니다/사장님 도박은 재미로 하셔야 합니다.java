
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        boolean b = true;
        while (b) {
            int i = scan.nextInt();
            if (i == -1) {
                b = false;
                break;
            }
            result += i;
        }
        System.out.println(result);
    }
}
