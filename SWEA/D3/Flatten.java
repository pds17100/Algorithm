package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int t = 1; t <= 10; t++) {
            int dump = Integer.parseInt(br.readLine());
            int height[] = new int[100];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < height.length; i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }
            int max = 99;
            int min = 0;
            for (int i = 0; i < dump; i++) {
                Arrays.sort(height);
                height[max]--;
                height[min]++;
            }
            Arrays.sort(height);
            int result = height[max] - height[min];
            System.out.println("#" + t + " " + result);
        }
    }
}
