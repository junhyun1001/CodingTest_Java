import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int max = Integer.MIN_VALUE;
        int start = 0;
        while (true) {
            int sum = 0;
            for (int i = start; i < start + k; i++) {
                sum += arr[i];
            }
            if (sum > max) {
                max = sum;
            }
            start++;
            if (start == arr.length - k + 1) break;
        }

        System.out.println(max);

    }
}
