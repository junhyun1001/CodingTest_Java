import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][1] = Integer.parseInt(st.nextToken());
            for (int j = 2; j <= m; j++) {
                arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());
        for (int a = 0; a < k; a++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int sum1 = 0;
            int sum2 = 0;

            for (int b = i; b <= x; b++) {
                sum1 += arr[b][y];
                sum2 += arr[b][j - 1];
            }

            System.out.println(sum1 - sum2);

        }

    }

}