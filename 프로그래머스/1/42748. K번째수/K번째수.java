
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];

            int len = b - a + 1;
            int arr[] = new int[len];
            for (int j = 0; j < len; j++) {
                arr[j] = array[a - 1 + j];
            }
            Arrays.sort(arr);
            answer[i] = arr[c-1];
        }

        return answer;
    }
}
