import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;
        int start = 0;
        int end = n - 1;
        int sum;

        while (start < end) {
            sum = arr[start] + arr[end];
            if (sum < m) {
                start++;
            } else if (sum > m) {
                end--;
            } else {
                answer++;
                start++;
                end--;
            }
        }

        System.out.println(answer);
    }
}