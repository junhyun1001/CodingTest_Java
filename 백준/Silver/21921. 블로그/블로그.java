import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] sum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            int cur = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + cur;
        }

        int[] visitors = new int[N - X + 1];
        for (int i = 0; i < visitors.length; i++) {
            visitors[i] = sum[i + X] - sum[i];
        }

        int max = 0;
        int count = 0;
        for (int visitor : visitors) {
            if (visitor == max) {
                count++;
            } else if (visitor > max) {
                max = visitor;
                count = 1;
            }
        }

        if (max > 0) {
            System.out.println(max);
            System.out.println(count);
        } else {
            System.out.println("SAD");
        }

    }
}
