import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }

            int[] sum = new int[n];
            int max = sum[0] = num[0];
            for (int j = 1; j < num.length; j++) {
                // 이 전의 값이 음수이면 0으로 초기화
                if (sum[j - 1] < 0) {
                    sum[j - 1] = 0;
                }
                // 합배열에 이전의 합배열의 값에 다음 값을 더함
                sum[j] = sum[j - 1] + num[j];
                max = Math.max(max, sum[j]);
            }

            System.out.println(max);
        }

    }
}