
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {  //숫자가짧은거먼저
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                //길이가 같다면 숫자합 비교
                int sumA = getSum(o1);
                int sumB = getSum(o2);
                if (sumA != sumB) {
                    return sumA - sumB;
                }

                return o1.compareTo(o2);    //사전순비교
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static int getSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { //숫자인경우더함
                sum += c - '0';
            }
        }
        return sum;
    }
}
