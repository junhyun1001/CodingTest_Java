import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        String[] strArr = br.readLine().split(" ");

        int[] arr = new int[n];
        int[] prefixSum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if (i == 0) {
                prefixSum[i] = arr[i];
            } else {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }
        }

        for (int i = 0; i < m; i++) {
            String[] s1 = br.readLine().split(" ");
            int a = Integer.parseInt(s1[0]) - 1;
            int b = Integer.parseInt(s1[1]) - 1;
            if (a == 0) {
                System.out.println(prefixSum[b]);
            } else {
                System.out.println(prefixSum[b] - prefixSum[a - 1]);
            }
        }
    }
}
