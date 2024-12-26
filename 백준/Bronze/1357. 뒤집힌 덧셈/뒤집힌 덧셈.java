
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sbnum1 = new StringBuilder(st.nextToken());
        StringBuilder sbnum2 = new StringBuilder(st.nextToken());
        String revnum1 = sbnum1.reverse().toString();
        String revnum2 = sbnum2.reverse().toString();
        int num1 = Integer.parseInt(revnum1);
        int num2 = Integer.parseInt(revnum2);
        StringBuilder sbresult = new StringBuilder(String.valueOf(num1 + num2));
        int result = Integer.parseInt(sbresult.reverse().toString());
        System.out.println(result);
    }

}
