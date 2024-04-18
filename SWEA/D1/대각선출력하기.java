package D1;

import java.io.IOException;

public class 대각선출력하기 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char[] chars = "+++++".toCharArray();
            chars[i] = '#';
            sb.append(chars).append("\n");
        }
        System.out.println(sb);
    }
}
