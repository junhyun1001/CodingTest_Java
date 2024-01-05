import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] num = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N];
        for (int i = 1; i < N; i++) {
            sum[i] = Math.abs(num[i + 1] - num[i]);
        }

        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int answer = 0;

            if (j - 1 < i) {
                System.out.println(answer);
                continue;
            } else {
                for (int k = i; k < j; k++) {
                    answer += sum[k];
                }

                System.out.println(answer);
            }

        }

    }
}
