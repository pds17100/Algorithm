
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());   //가로
        int y = Integer.parseInt(st.nextToken());   //세로
        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            if (Integer.parseInt(st.nextToken()) == 0) {
                list0.add(Integer.parseInt(st.nextToken()));
            } else {
                list1.add(Integer.parseInt(st.nextToken()));
            }
        }
        list0.add(0);
        list1.add(0);
        list0.add(y);
        list1.add(x);

        Collections.sort(list0);
        Collections.sort(list1);

        int arr0[] = new int[list0.size() - 1];
        int arr1[] = new int[list1.size() - 1];

        for (int i = 0; i < list0.size() - 1; i++) {
            arr0[i] = list0.get(i + 1) - list0.get(i);
        }
        for (int i = 0; i < list1.size() - 1; i++) {
            arr1[i] = list1.get(i + 1) - list1.get(i);
        }

        Arrays.sort(arr0);
        Arrays.sort(arr1);

        int result = arr0[arr0.length - 1] * arr1[arr1.length - 1];

        System.out.println(result);
    }
}
