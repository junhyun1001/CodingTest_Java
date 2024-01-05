import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[n - 1];
        sum[0] = num[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + num[i];
        }

        long answer = 0;
        for (int i = 1; i < n; i++) {
            answer += (long)num[i] * (long)sum[i - 1];
        }

        System.out.println(answer);

    }
}
